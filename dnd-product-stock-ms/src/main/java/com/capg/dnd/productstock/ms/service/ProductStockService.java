
/**
	* Project Name : Drink And Delight Inventory Management System
	*
	* 
**/

package com.capg.dnd.productstock.ms.service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.NoProductStocksAreAvailableException;
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
   
   /**
	* Adds a New ProductStock in the repository
	* @return   :ProductStock Object
	* @throws   :ProductOrderIdAlreadyExistsException
	* @author   :Devu Om SriDatta Sai Swaroop
	* @since    :2020-08-17 
	**/
	@Override
	public ProductStock addProductStock(ProductStock stock) throws ProductOrderIdAlreadyExistsException {
		if(repo.existsById(stock.getOrderId())) {
			throw new ProductOrderIdAlreadyExistsException("orderId already Exists");
		}
		else {
	return repo.save(stock);
		
	}
		}
	
	/**
	* Deletes a specified ProductStock in the  repository
	* @return   :Boolean
	* @throws   :ProductOrderIdNotFoundException
	* @author   :Devu Om SriDatta Sai Swaroop
	 
	* @since    :2020-08-17 
	**/

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

	

	
	
	/**
	* Fetches a ProductStock by taking specified orderId as input parameter
	* @return   :ProductStock Object 
	* @throws   :ProductOrderIdNotFoundException 
	* @author   :Devu Om SriDatta Sai Swaroop
	* @since    :2020-08-17 
	**/
	@Override
	public ProductStock getProductStockDetails(String orderId) throws ProductOrderIdNotFoundException {
		if(repo.existsById(orderId)) {
		
			return repo.getOne(orderId);
			}
			else {
				throw new ProductOrderIdNotFoundException("orderId doesn't exist");
			}
		
	}
	/**
	* Fetches all ProductStockDetails in the repository
	* @return   :List of ProductStock  
	* @throws   :NoProductStocksAreAvailableException
	* @author   :Devu Om SriDatta Sai Swaroop
	* @since    :2020-08-17 
	**/
	@Override
	public List<ProductStock> getAllProductStockDetails() throws NoProductStocksAreAvailableException  {
		
		return repo.findAll();
	}

	/**
	* updates a ProductStock in the repository
	* @return   :ProductStock Object
	* @throws   :ProductOrderIdNotFoundException,InvalidExpiryDateException
	* @author   :Devu Om SriDatta Sai Swaroop
	* @since    :2020-08-17 
	**/
	@Override
	public ProductStock updateProductStockDetails(ProductStock newStock) throws ProductOrderIdNotFoundException, InvalidExpiryDateException {
		ProductOrder order = rt.getForObject("http://DND-PRODUCTORDER-MS/ProductOrder/GetProductOrderDetail/"+newStock.getOrderId(), ProductOrder.class);
		System.out.println(newStock);
		System.out.println(order);
		
		if(order.getOrderId().equals(newStock.getOrderId())){
			
			
		 
	tempStock.setOrderId(newStock.getOrderId());
	tempStock.setProductName(order.getName());
	tempStock.setPricePerUnit(order.getPricePerunit());
	tempStock.setQuantityValue(order.getQuantityValue());
	tempStock.setTotalPrice(order.getTotalPrice());
	tempStock.setWarehouseID(order.getWarehouseId());
	tempStock.setDeliveryDate(order.getDateofDelivery());
	tempStock.setProcessDate(new Date());
	if(validateExpiryDate(newStock.getManufacturingDate(),newStock.getExpiryDate())) {
	
	tempStock.setManufacturingDate(newStock.getManufacturingDate());
	tempStock.setExpiryDate(newStock.getExpiryDate());
	}
	else
		throw new InvalidExpiryDateException("Enter Valid Expiry Date");
	
	tempStock.setQualityCheck(newStock.getQualityCheck());
	System.out.println("tempStock"+repo.save(tempStock));
	
	return repo.save(tempStock);
		}
		else 
			throw new  ProductOrderIdNotFoundException("orderId doesn't exist");
		
	}
	

		

	/**
	* Validates Whether Manufacturing Date And Expiry Date are Valid or Not
	* @return   :Boolean
	* @throws   :InvalidExpiryDateException
	* @author   :Devu Om SriDatta Sai Swaroop
	* @since    :2020-08-17 
	**/



	public  boolean validateExpiryDate(Date manufacturingDate,Date expiryDate) throws InvalidExpiryDateException  {
		 SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    
	      System.out.println("The date 1 is: " + sdformat.format(manufacturingDate));
	      System.out.println("The date 2 is: " + sdformat.format(expiryDate));
	      if(manufacturingDate.compareTo(expiryDate) > 0) {
	         System.out.println("Date 1 occurs after Date 2");
	          throw new InvalidExpiryDateException("Enter Valid Expiry Date");
	          
	      } else if(manufacturingDate.compareTo(expiryDate) < 0) {
	    	  
	         System.out.println("Date 1 occurs before Date 2");
	         return true;
	      } else if(manufacturingDate.compareTo(expiryDate) == 0) {
	         System.out.println("Both dates are equal");
	         throw new InvalidExpiryDateException("Enter Valid Date");
	      }
		return false;
		
		
	}
}





























//
////if( order.getOrderId()==newStock.getOrderId()) {
//
//tempStock.setOrderId(order.getOrderId());	
//tempStock.setProductName(newStock.getProductName());
//tempStock.setPricePerUnit(newStock.getPricePerUnit());
//tempStock.setQuantityValue(newStock.getQuantityValue());
//tempStock.setTotalPrice(newStock.getTotalPrice());
//tempStock.setWarehouseID(newStock.getWarehouseID());
//
////ProductStock oldStock=repo.getOne(newStock.getOrderId());
////validateExpiryDate(newStock.getManufacturingDate(), newStock.getExpiryDate());
