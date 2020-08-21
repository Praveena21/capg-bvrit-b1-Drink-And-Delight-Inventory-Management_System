package com.capg.dnd.productorder.ms.controller;


	import java.util.List;
	import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.productorder.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productorder.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productorder.ms.model.ProductOrder;
import com.capg.dnd.productorder.ms.service.IProductOrderService;


	@RestController
	@RequestMapping(value="/ProductOrder")
	public class ProductOrderController {
     @PostConstruct
     void  init() {
    	 System.out.println("hello vinay");
     }
     
		@Autowired
		IProductOrderService serviceobj;
		
		//Add ProductOrder
		@PostMapping(value="/addProductOrder")
		public ResponseEntity<ProductOrder>addProductOrder(@RequestBody ProductOrder r ) throws ProductOrderIdAlreadyExistsException
		{
			ProductOrder e = serviceobj.addProductOrder(r);
			if(e == null)
			{
				throw new ProductOrderIdNotFoundException("Enter Valid Id");
			}
			else {
				return new ResponseEntity<ProductOrder>(e,HttpStatus.OK);		
			}
			
			
		}
          
		//Get all ProductOrders
		@GetMapping(value="/GetAllProductOrders")
		private ResponseEntity<List<ProductOrder>> getAllOrders() 
		    {
			List<ProductOrder> ProductOrderlist = serviceobj.getAllProductOrders();
			return new ResponseEntity<List<ProductOrder>>(ProductOrderlist, HttpStatus.OK);
	        }
		
		// Get Particular ProductorderDetail
				@GetMapping(value="/GetProductOrderDetail/{orderId}")
				private ResponseEntity<ProductOrder> getProductOrderById(@PathVariable("orderId") String orderId) {
					ProductOrder d = serviceobj.getProductOrderDetailById(orderId);
					if (d == null) {
						throw new ProductOrderIdNotFoundException("Id does not exist,so we couldn't fetch details");
					} else {
						return new ResponseEntity<ProductOrder>(d,  HttpStatus.OK);
					}
				}

		
				
	    //Update ProductOrder
	    @PutMapping(value="/UpdateUser")
		public ResponseEntity<String> updateProductOrder(@RequestBody ProductOrder r)
			{
	    	ProductOrder e = serviceobj.updateProductOrder(r);
				if (e == null) {
					throw new ProductOrderIdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
				} else {
					return new ResponseEntity<String>("ProductOrder updated successfully", new HttpHeaders(), HttpStatus.OK);
				}
			}
			
		// Delete ProductOrder
		@DeleteMapping(value="/DeleteProductOrder/{orderId}")
		private ResponseEntity<String> deleteProductOrder(@PathVariable("orderId") String orderId)
			{
			     
			serviceobj.deleteProductOrder(orderId);
				
					return new ResponseEntity<String>("ProductOrder deleted successfully", new HttpHeaders(), HttpStatus.OK);
				}
		
		
		
	}

