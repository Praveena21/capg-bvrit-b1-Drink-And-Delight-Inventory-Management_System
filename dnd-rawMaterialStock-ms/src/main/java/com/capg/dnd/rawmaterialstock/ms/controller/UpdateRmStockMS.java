package com.capg.dnd.rawmaterialstock.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.service.UpdateRMstockServiceImpl;

public class UpdateRmStockMS {
	@Autowired
	UpdateRMstockServiceImpl service;
	
	@PostMapping("/add")
	public RawMaterialStock addRawMaterialStock(@RequestBody RawMaterialStock stock) {
		return service.addRawMaterialStock(stock);
	}
	
	@DeleteMapping("/delete/{orderId}")
	public boolean deleteRawMaterialStock(@PathVariable("OrderId") String orderId) {
		return service.deleteRawMaterialStock(orderId);
	}
	@GetMapping("/id/{orderId}")
	public RawMaterialStock getRawMaterialStockDetails(@PathVariable String orderId) {
		return service.getRawMaterialStockDetails(orderId);
	}
	@GetMapping("/all")
	public List<RawMaterialStock> getAllRawMaterialStockDetails(){
		return service.getAllRawMaterialStockDetails();
	}
	
	@PutMapping("/update/{orderId}")
	public RawMaterialStock updateRawMaterialStock(@RequestBody RawMaterialStock stock) {
		return service.updateRawMaterialStock(stock);
	}


}
