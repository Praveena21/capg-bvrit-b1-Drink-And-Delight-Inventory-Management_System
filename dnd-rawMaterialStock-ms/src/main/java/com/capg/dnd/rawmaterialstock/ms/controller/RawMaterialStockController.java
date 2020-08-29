package com.capg.dnd.rawmaterialstock.ms.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.service.UpdateRMstockServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
@RequestMapping("/RawMaterialStock")

public class RawMaterialStockController {
	
	@Autowired

	UpdateRMstockServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<RawMaterialStock> addRawMaterialStock(@RequestBody RawMaterialStock stock) {
		return new ResponseEntity<RawMaterialStock>(stock,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{orderId}")

	public boolean deleteRawMaterialStock(@PathVariable("OrderId") String orderId) {
		return service.deleteRawMaterialStock(orderId);
	}
	@GetMapping("/id/{orderId}")
	@HystrixCommand(fallbackMethod = "idNotFoundFallback")
	public RawMaterialStock getRawMaterialStockDetails(@PathVariable String orderId) {
		return service.getRawMaterialStockDetails(orderId);
	}
	
	@GetMapping("/all")
	public List<RawMaterialStock> getAllRawMaterialStockDetails(){
		return service.getAllRawMaterialStockDetails();
	}
	
	@PutMapping("/update")
	public RawMaterialStock updateRawMaterialStock(@RequestBody RawMaterialStock stock) {
		return service.updateRawMaterialStock(stock);
	}
	               
	public RawMaterialStock idNotFoundFallback(@PathVariable String orderId) {
		return new RawMaterialStock("1000", "TV", 100000);
	}

}
