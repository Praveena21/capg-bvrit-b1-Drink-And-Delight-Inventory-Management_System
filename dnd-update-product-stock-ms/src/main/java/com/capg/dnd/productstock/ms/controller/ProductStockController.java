package com.capg.dnd.productstock.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.service.ProductStockService;

@RestController
public class ProductStockController {
	@Autowired
	ProductStockService service;

	@PostMapping("/add")
	public ProductStock addProductStock(ProductStock stock) {

		return service.addProductStock(stock);

	}
	@DeleteMapping("/delete/{orderid}")
	public boolean deleteProductStock(@PathVariable String orderId) {
		return service.deleteProductStock(orderId);}
	@GetMapping("/id/{orderId}")
	public ProductStock getProductStockDetails(@PathVariable String orderId) {
		return service.getProductStockDetails(orderId);
		}
	@GetMapping("/all")
	public List<ProductStock> getAllProductStockDetails(){
		return service.getAllProductStockDetails();
		
	}
	@PutMapping("/update/{orderId}")
	public ProductStock updateProductStock(@RequestBody ProductStock stock) {
		
		return service.updateProductStock(stock);}

}
