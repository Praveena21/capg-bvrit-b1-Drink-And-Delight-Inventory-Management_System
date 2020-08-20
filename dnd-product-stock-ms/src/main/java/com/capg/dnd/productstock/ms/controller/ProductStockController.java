package com.capg.dnd.productstock.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.service.ProductStockService;

@RestController
@RequestMapping("/product")
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
	
	@GetMapping("/id/{orderId}")
	public ProductStock getProductStockDetails(@PathVariable("orderId") String orderId) throws ProductOrderIdNotFoundException {
		return service.getProductStockDetails(orderId);
		}
	@GetMapping("/all")
	public List<ProductStock> getAllProductStockDetails(){
		return service.getAllProductStockDetails();
		
	}
	@PutMapping("/update")
	public ProductStock updateProductStock(@RequestBody ProductStock stock) throws ProductOrderIdNotFoundException, InvalidExpiryDateException {
		
		return service.updateProductStockDetails(stock);
		}
	
	@PutMapping("/processDate/{orderId}") 
	public String updateProcessDate(@PathVariable("orderId") String orderId) throws ProductOrderIdNotFoundException {
		return service.updateProcessDate(orderId);
	
		
	}


     }