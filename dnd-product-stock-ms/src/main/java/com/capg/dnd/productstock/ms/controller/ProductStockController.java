package com.capg.dnd.productstock.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.NoProductStocksAreAvailableException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.service.ProductStockService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
@RequestMapping("/productStock")
public class ProductStockController {
	@Autowired
	ProductStockService service;

	@PostMapping("/add")
	public ProductStock addProductStock(@RequestBody ProductStock stock) throws ProductOrderIdAlreadyExistsException {
		
System.out.println(stock);

		return service.addProductStock(stock);
		
	}
	@DeleteMapping("/delete/{orderId}") 
	public boolean deleteProductStock(@PathVariable("orderId") String orderId) throws ProductOrderIdNotFoundException {
		return service.deleteProductStock(orderId);
		}

	@GetMapping("/all")
	
	public List<ProductStock> getAllProductStockDetails() throws NoProductStocksAreAvailableException{
		return service.getAllProductStockDetails();
		
	}
	@PutMapping("/update")
	public ProductStock updateProductStock(@RequestBody ProductStock stock) throws ProductOrderIdNotFoundException, InvalidExpiryDateException {
		
		return service.updateProductStockDetails(stock);
		}

	
	
	@GetMapping("/id/{orderId}")
	@HystrixCommand(fallbackMethod = "productOrderIdNotFoundFallback")
	public ProductStock getProductStockDetails(@PathVariable("orderId") String orderId) throws ProductOrderIdNotFoundException {
		System.out.println(orderId);
		return service.getProductStockDetails(orderId);
		}
	
	public ProductStock productOrderIdNotFoundFallback(@PathVariable("orderId") String orderId)  {
		return new ProductStock("1000", "TV", 1000000);
		} 

     }













