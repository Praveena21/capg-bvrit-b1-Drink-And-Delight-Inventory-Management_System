package com.capg.dnd.productstock.ms.service;


import java.time.LocalDateTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductOrder;
import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.repository.IProductStockRepo;


@Service
public class ProductStockService implements IProductStockService {
   @Autowired
	IProductStockRepo repo;
   @Autowired
   RestTemplate rt;
   @Autowired
   ProductStock tempStock;
	@Override
	public ProductStock addProductStock(ProductStock stock) throws ProductOrderIdAlreadyExistsException {
		if(repo.existsById(stock.getOrderId())) {
			throw new ProductOrderIdAlreadyExistsException("orderId already Exists");
		}
		else {
	return repo.save(stock);
		
	}
		}

	@Override
	public boolean deleteProductStock(String orderId) throws ProductOrderIdNotFoundException {
		if(repo.existsById(orderId)) {
		repo.deleteById(orderId);
		}
		else {
			throw new ProductOrderIdNotFoundException("orderId doesn't exist");
		}
		return !repo.existsById(orderId);
	}

	@Override
	public ProductStock getProductStockDetails(String orderId) throws ProductOrderIdNotFoundException {
		if(repo.existsById(orderId)) {
		
			return repo.getOne(orderId);
			}
			else {
				throw new ProductOrderIdNotFoundException("orderId doesn't exist");
			}
		
	}

	@Override
	public List<ProductStock> getAllProductStockDetails() {
		
		return repo.findAll();
	}

	@Override
	public ProductStock updateProductStockDetails(ProductStock newStock) throws ProductOrderIdNotFoundException, InvalidExpiryDateException {
		ProductOrder order = rt.getForObject("http://localhost:8700/ProductOrder/GetProductOrderDetail/"+newStock.getOrderId(), ProductOrder.class);
		System.out.println(newStock);
		System.out.println(order);
		//if( order.getOrderId()==newStock.getOrderId()) {
		
			tempStock.setOrderId(order.getOrderId());	
			tempStock.setProductName(newStock.getProductName());
			tempStock.setPricePerUnit(newStock.getPricePerUnit());
			tempStock.setQuantityValue(newStock.getQuantityValue());
			tempStock.setTotalPrice(newStock.getTotalPrice());
			tempStock.setWarehouseID(newStock.getWarehouseID());
			
    //ProductStock oldStock=repo.getOne(newStock.getOrderId());
	//validateExpiryDate(newStock.getManufacturingDate(), newStock.getExpiryDate());
	tempStock.setManufacturingDate(newStock.getManufacturingDate());
	tempStock.setExpiryDate(newStock.getExpiryDate());
	tempStock.setQualityCheck(newStock.getQualityCheck());
	System.out.println("tempStock"+repo.save(tempStock));
	
	return repo.save(tempStock);
		
		//}
//		else {
//			System.out.println("hello stock");
//			throw new ProductOrderIdNotFoundException("orderId doesn't exist");
//		}
		/*
		 * oldStock.setManufacturingDate(newStock.getManufacturingDate());
		 * oldStock.setExpiryDate(newStock.getExpiryDate());
		 * 
		 * oldStock.setQualityCheck(newStock.getQualityCheck());
		 */

		
	}

	@Override
	public String updateProcessDate(String orderId) throws ProductOrderIdNotFoundException {
		if(repo.existsById(orderId)) {
		ProductStock stock=repo.getOne(orderId);
		stock.setProcessDate(LocalDateTime.now());
		repo.save(stock);
			return "Successfully updated processDate";
			}
			else {
				throw new ProductOrderIdNotFoundException("orderId doesn't exist");
			}
	
		
	}

//	public static boolean validateExpiryDate(LocalDateTime manufacturingDate,LocalDateTime expiryDate) throws InvalidExpiryDateException  {
//	//if(manufacturingDate < LocalDateTime.now())
//		
//		return false;
//		
//	}
}
