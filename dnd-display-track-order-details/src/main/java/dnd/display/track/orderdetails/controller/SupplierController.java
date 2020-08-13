package dnd.display.track.orderdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dnd.display.track.orderdetails.model.SupplierEntity;
import dnd.display.track.orderdetails.service.SupplierServiceImpl;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	SupplierServiceImpl service;
	
	@GetMapping("/a")
	public String getMessage() {
		return "Welcome";
	}
	
	@PostMapping("/add")
	public SupplierEntity addSupplierDetails(@RequestBody SupplierEntity details) {
		return service.addSupplierDetails(details);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteSupplierDetails(@PathVariable("SupplierId") int supplierId) {
		return service.deleteSupplierDetails(supplierId);
	}
	
	@GetMapping("/id/{supplierId}")
	public SupplierEntity getSupplierDetails(@PathVariable int supplierId) {
		return service.getSupplierDetails(supplierId);
	}
	
	@GetMapping("/all")
	public List<SupplierEntity> getAllSupplierDetails(){
		return service.getAllSupplierDetails();
	}
}
