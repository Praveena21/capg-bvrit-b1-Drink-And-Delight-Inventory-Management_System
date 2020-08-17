package com.capg.dnd.supplier.ms.controller;

import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.supplier.ms.model.Supplier;
import com.capg.dnd.supplier.ms.service.SupplierServiceImpl;

import io.micrometer.core.ipc.http.HttpSender.Response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	private static final String supplierId = null;
	@Autowired
	SupplierServiceImpl service;
	
	@GetMapping("/a")
	public String getMessage() {
		return "Welcome";
	}
	@PostMapping("/add")
	public Supplier addSupplier(@RequestBody Supplier supplier) {
		
	return service.addSupplier(supplier);
	}

 @DeleteMapping("/delete/{supplierId}")
public boolean deleteSupplier(@PathVariable("supplierId") Long supplierId) {
	return service.deleteSupplier(supplierId);
}
@GetMapping("/id/{supplierId}")
public ResponseEntity<Supplier>getSupplierById(@PathVariable("supplierId") Long supplierId) {
Long supplier = null;
Supplier info = service.getSupplierById(supplier);
return new ResponseEntity<Supplier>(info,HttpStatus.OK);
}
@GetMapping("/all")
public List<Supplier> getAllSupplier(){
	return service.getAllSupplier();
}

@PutMapping("/update/{id}")
public Supplier updateSupplier(@RequestBody Supplier supplier) {
	return  service.updateSupplier(supplier);
}
@GetMapping("/RMdetails/{supplierId}")
public Supplier fetchRawMaterialDetails(Long supplierId,String deliveryStatus) {
	return null;
	
}
}
	
	
