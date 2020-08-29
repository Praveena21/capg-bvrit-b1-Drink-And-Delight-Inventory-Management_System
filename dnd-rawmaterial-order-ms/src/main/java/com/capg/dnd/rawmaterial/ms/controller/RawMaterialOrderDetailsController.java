package com.capg.dnd.rawmaterial.ms.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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


import com.capg.dnd.rawmaterial.ms.exceptions.*;
import com.capg.dnd.rawmaterial.ms.model.*;
import com.capg.dnd.rawmaterial.ms.service.*;



@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
@RequestMapping(value="/RawMaterialOrder")
public class RawMaterialOrderDetailsController {

	@Autowired
	RawMaterialOrderDetailsService serviceobj;
	
	//Add RawMaterialOrder
	@PostMapping(value="/addRawMaterialOrder")
	public RawMaterialOrderDetails addRawMaterialOrder(@RequestBody RawMaterialOrderDetails r) throws IdAlreadyExistsException {
		
		return serviceobj.addRawMaterialOrder(r);
		}

	//Get all RawMaterialOrders
	@GetMapping(value="/all")
	private ResponseEntity<List<RawMaterialOrderDetails>> getAllRawMaterialOrders() 
	    {
		List<RawMaterialOrderDetails> RawMaterialOrderlist = serviceobj.getAllRawMaterialOrders();
		return new ResponseEntity<List<RawMaterialOrderDetails>>(RawMaterialOrderlist, HttpStatus.OK);
        }

			@GetMapping("/id/{orderId}")
			//@HystrixCommand(fallbackMethod = "idNotFoundFallback")
			public RawMaterialOrderDetails getRawNaterialOrderDetails(@PathVariable("orderId") String orderId) throws IdNotFoundException {
				return serviceobj.getRawMaterialOrderDetailById(orderId);
				}

			
    //Update RawMaterialOrder
    @PutMapping(value="/UpdateUser")
	public ResponseEntity<String> updateRawMaterialOrder(@RequestBody RawMaterialOrderDetails r)
		{
    	RawMaterialOrderDetails e = serviceobj.updateRawMaterialOrder(r);
			if (e == null) {
				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
			} else {
				return new ResponseEntity<String>("RawMaterialOrder updated successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
		
	@PutMapping(value = "/Update/{orderId}/{deliveryStatus}")
	public ResponseEntity<String> update(@PathVariable ("orderId") String orderId,@PathVariable ("deliveryStatus") String deliveryStatus) {
		RawMaterialOrderDetails e = serviceobj.update(orderId,deliveryStatus);
		if (e == null) {
			throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("ProductOrder updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}
	// Delete RawMaterialOrder
	@DeleteMapping(value="/DeleteRawMaterialOrder/{orderId}")
	private ResponseEntity<String> deleteRawMaterialOrder(@PathVariable("orderId") String orderId)
		{
		     serviceobj.deleteRawMaterialOrder(orderId);
			
				return new ResponseEntity<String>("RawMaterialOrder deleted successfully", new HttpHeaders(), HttpStatus.OK);
			}
	
	@GetMapping("/sups")
     public  Supplier[] fetchSupplierIds(){
		return serviceobj.fetchSupplierIds();};
		
	@GetMapping("/sup/{id}")
	public Supplier fetchSupplierDetail(@PathVariable("id") int SupplierId) {
		return serviceobj.fetchSupplierDetail(SupplierId);
		}
		
		public RawMaterialOrderDetails idNotFoundFallback(@PathVariable("orderId") String orderId) {
			return new RawMaterialOrderDetails("1000", "TV", 1000000);
			}
	
}
