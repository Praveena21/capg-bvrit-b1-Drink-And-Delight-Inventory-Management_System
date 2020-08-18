package com.capg.dnd.distributordetails.controller;
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

import com.capg.dnd.distributordetails.exception.DistributorIdNotFoundException;
import com.capg.dnd.distributordetails.model.Distributor;
import com.capg.dnd.distributordetails.service.DistributorServiceImpl;
@RestController
@RequestMapping("/distributor")
public class DistributorController {
	//private static final String DistributorId = null;
	@Autowired
	DistributorServiceImpl service;
	
	@GetMapping("/a")
	public String getMessage() {
		return "Welcome";
	}

	@PostMapping("/add")
	public Distributor addDistributor(@RequestBody Distributor distributor) {
		return service.addDistributor(distributor);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteDistributor(@PathVariable("DistributorId") int distributorId) {
		return service.deleteDistributor(distributorId);
	}
	
	@GetMapping("/id/{distributorId}")
	public Distributor getDistributor(@PathVariable int distributorId) {
		return service.getDistributor(distributorId);
	}
	
	@GetMapping("/all")
	public List<Distributor> getAllDistributors(){
		return service.getAllDistributors();
	}

@PutMapping("/updateDistributorId")
public Distributor updateDistributor(@RequestBody Distributor distributor)
{
return service.updateDistributor(distributor);
}
@GetMapping("/RMdetails/{distributorId}")
public Distributor fetchRawMaterialDetails(Long distributorId,String delivereyStatus) {
	return null;
	}

}