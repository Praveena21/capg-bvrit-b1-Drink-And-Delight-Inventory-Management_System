package dnd.distributordetails.controller;

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



import dnd.distributordetails.model.DistributorEntity;
import dnd.distributordetails.service.DistributorServiceImpl;

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
	public ResponseEntity<DistributorEntity> addDistributorDetails(@RequestBody DistributorEntity details) {
		 service.addDistributorDetails(details);
		 return new ResponseEntity<>(details,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDistributorDetails(@PathVariable("id") int distributorId) {
		service.deleteDistributorDetails(distributorId);
		return new ResponseEntity<String>("Deleted Requested Id",HttpStatus.OK);
		
	}
	
	@GetMapping("/id/{distributorId}")
	public DistributorEntity getDistributorDetails(@PathVariable int distributorId) {
		return service.getDistributorDetails(distributorId);
	}
	
	@GetMapping("/all")
	public ResponseEntity< List<DistributorEntity> > getAllDistributorDetails(){
		List<DistributorEntity> list=service.getAllDistributorDetails();
		return new ResponseEntity<List<DistributorEntity>>(list,HttpStatus.OK);
}
	
@PutMapping("/updateDistributorId")
public DistributorEntity updateDistributor(@RequestBody DistributorEntity distributor)
{
return service.updateDistributor(distributor);
}
@GetMapping("/RMdetails/{distributorId}")
public DistributorEntity fetchRawMaterialDetails(Integer distributorId,String delivereyStatus) {
	return null;
	}
}
