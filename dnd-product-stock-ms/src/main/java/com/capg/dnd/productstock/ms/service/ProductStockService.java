package com.capg.dnd.productstock.ms.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.repository.IProductStockRepo;
@Service
public class ProductStockService implements IProductStockService {
   @Autowired
	IProductStockRepo repo;
   
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
		if(repo.existsById(newStock.getOrderId())) {
		
				
    //ProductStock oldStock=repo.getOne(newStock.getOrderId());
	validateExpiryDate(newStock.getManufacturingDate(), newStock.getExpiryDate());
	return repo.save(newStock);
		}
		else {
			throw new ProductOrderIdNotFoundException("orderId doesn't exist");
		}
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
		stock.setProcessDate( new Date());
		repo.save(stock);
			return "Successfully updated processDate";
			}
			else {
				throw new ProductOrderIdNotFoundException("orderId doesn't exist");
			}
	
		
	}

	public static boolean validateExpiryDate(Date manufacturingDate,Date expiryDate) throws InvalidExpiryDateException  {
//		if(manufacturingDate < expiryDate)
		return false;
		
	}
}
