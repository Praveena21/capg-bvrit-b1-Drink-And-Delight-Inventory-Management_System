package com.capg.dnd.rawmaterial.ms.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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

import com.capg.dnd.rawmaterial.ms.exceptions.*;
import com.capg.dnd.rawmaterial.ms.model.*;
import com.capg.dnd.rawmaterial.ms.service.*;


@RestController
@RequestMapping(value="/RawMaterialOrder")
public class RawMaterialOrderDetailsController {

	@Autowired
	RawMaterialOrderDetailsService serviceobj;
	
	//Add RawMaterialOrder
	@PostMapping(value="/addRawMaterialOrder")
	public RawMaterialOrderDetails addRawMaterialOrder(@RequestBody RawMaterialOrderDetails r) throws IdAlreadyExistsException {
		
		return serviceobj.addRawMaterialOrder(r);
		}
//	public ResponseEntity<String>addRawMaterialOrder(@RequestBody RawMaterialOrderDetails r )
//	{
//		RawMaterialOrderDetails e = serviceobj.addRawMaterialOrder(r);
//		if(e == null)
//		{
//			throw new IdNotFoundException("Enter Valid Id");
//		}
//		else {
//			return new ResponseEntity<String>("RawMaterialOrder placed by praneeth successfully",new HttpHeaders(),HttpStatus.OK);		
//		}
//	}

	//Get all RawMaterialOrders
	@GetMapping(value="/GetAllRawMaterialOrders")
	private ResponseEntity<List<RawMaterialOrderDetails>> getAllRawMaterialOrders() 
	    {
		List<RawMaterialOrderDetails> RawMaterialOrderlist = serviceobj.getAllRawMaterialOrders();
		return new ResponseEntity<List<RawMaterialOrderDetails>>(RawMaterialOrderlist, HttpStatus.OK);
        }
	
	// Get Particular RawMaterialorderDetail
		//	@GetMapping(value="/GetRawmaterialOrderDetail/{orderId}")
			//private ResponseEntity<RawMaterialOrderDetails> getRawMaterialOrderDetailsById(@PathVariable("orderId") String orderId) {
				//RawMaterialOrderDetails d = serviceobj.getRawMaterialOrderDetailById(orderId);
				//if (d == null) {
					//throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
			//	} else {
				//	return new ResponseEntity<RawMaterialOrderDetails>(d,  HttpStatus.OK);
				//}
				
			//}
			@GetMapping("/id/{orderId}")
			public RawMaterialOrderDetails getRawNaterialOrderDetails(@PathVariable("orderId") String orderId) throws IdNotFoundException {
				return serviceobj.getRawMaterialOrderDetailById(orderId);
				}
//			@GetMapping(value= "/Supplierdetails/{orderid}")
//			private Optional<SupplierDetails> getSuplierDetails(@PathVariable("orderid") int order_id) {
//				Optional<SupplierDetails> details=serviceobj.getSuplierDetails(order_id);
//				
//				return details; 
//			}
	
			
    //Update RawMaterialOrder
    @PutMapping(value="/UpdateUser")
    public RawMaterialOrderDetails updateRawMaterialOrder(@RequestBody RawMaterialOrderDetails r) throws UserNotFoundException{
    return serviceobj.updateRawMaterialOrder(r);}
//	public ResponseEntity<String> updateRawMaterialOrder(@RequestBody RawMaterialOrderDetails r)
//		{
//    	RawMaterialOrderDetails e = serviceobj.updateRawMaterialOrder(r);
//			if (e == null) {
//				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
//			} else {
//				return new ResponseEntity<String>("RawMaterialOrder updated successfully", new HttpHeaders(), HttpStatus.OK);
//			}
//		}
		
	// Delete RawMaterialOrder
	@DeleteMapping(value="/DeleteRawMaterialOrder/{orderId}")
	private ResponseEntity<String> deleteRawMaterialOrder(@PathVariable("orderId") String orderId)
		{
		     serviceobj.deleteRawMaterialOrder(orderId);
			
				return new ResponseEntity <String>("RawMaterialOrder deleted successfully", new HttpHeaders(), HttpStatus.OK);
			}
	
	
	
}
