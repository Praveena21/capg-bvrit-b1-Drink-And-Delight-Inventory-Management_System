package com.capg.dnd.rawmaterial.ms.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.rawmaterial.ms.model.RawMaterialOrder;

import com.capg.dnd.rawmaterial.ms.service.TrackOrderServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrackOrderRestController {
	@Autowired
	TrackOrderServiceImpl tsi;

	@PostMapping("/rawmaterial/insert")
	
	public String insertRawMaterials(@RequestBody RawMaterialOrder order) {
		RawMaterialOrder rawmaterialbean = tsi.insertRawMaterials(order);
		return "Hello " + rawmaterialbean.getName() + rawmaterialbean.getPricePerUnit()
				+ rawmaterialbean.getQuantityUnit() + "\n Your Insertion is Successfull\n" + "Your Account Id is "
				+ rawmaterialbean.getOrderId();
	}

	
	@GetMapping("/rawmaterial/findall") // GET: http://localhost:8090/bank/findall
	public List<RawMaterialOrder> getall() {

		List<RawMaterialOrder> order = tsi.getAll();
		return order;
	}

	
	@DeleteMapping("/rawmaterial/delete/{id}")
	public String deleteRawMaterials(@PathVariable int id) throws Exception {
		RawMaterialOrder rawmaterialorder = tsi.deleteRawMaterials(id);
		if (rawmaterialorder == null) {
			throw new Exception("Invalid id");
		}
		return "Hello " + "\n your Account has been deleted successfully\n" + " of id:" + rawmaterialorder.getOrderId();
	}

	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}

}
