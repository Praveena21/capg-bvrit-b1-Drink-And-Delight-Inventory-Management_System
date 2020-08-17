package com.capg.dnd.distributordetails.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.distributordetails.model.Distributor;
import com.capg.dnd.distributordetails.service.DistributorServiceImpl;



@RestController
@RequestMapping("/distributor")
public class DistributorController {
	@Autowired
	DistributorServiceImpl service;
	
	@GetMapping("/a")
	public String getMessage() {
		return "Welcome";
	}

	@PostMapping("/add")
	public Distributor addDistributorDetails(@RequestBody Distributor details) {
		return service.addDistributorDetails(details);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteDistributorDetails(@PathVariable("DistributorId") int distributorId) {
		return service.deleteDistributorDetails(distributorId);
	}
	
	@GetMapping("/id/{distributorId}")
	public Distributor getDistributorDetails(@PathVariable int distributorId) {
		return service.getDistributorDetails(distributorId);
	}
	
	@GetMapping("/all")
	public List<Distributor> getAllDistributorDetails(){
		return service.getAllDistributorDetails();
	}
}

