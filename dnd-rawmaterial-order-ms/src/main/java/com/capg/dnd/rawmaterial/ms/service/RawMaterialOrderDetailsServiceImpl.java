package com.capg.dnd.rawmaterial.ms.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.rawmaterial.ms.repo.*;
import com.capg.dnd.rawmaterial.ms.exceptions.IdAlreadyExistsException;
import com.capg.dnd.rawmaterial.ms.exceptions.IdNotFoundException;

import com.capg.dnd.rawmaterial.ms.model.*;


@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsRepo repo;
	RestTemplate rt;

	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		
		if(repo.existsById(r.getOrderId())) {
			throw new IdAlreadyExistsException("Id Already Exists");
			
		}
		else {
			return repo.save(r);
		}
	}
	

	@Override
	public List<RawMaterialOrderDetails> getAllRawMaterialOrders() {
		return repo.findAll();
	}
	
	

	@Override
	public RawMaterialOrderDetails getRawMaterialOrderDetailById(String orderId) {
	
		if(repo.existsById(orderId)) {
			
			return repo.getOne(orderId);
			}
			else {
				throw new IdNotFoundException("orderId doesn't exist");
			}
	}

	@Override
	public void deleteRawMaterialOrder(String orderId) {
		repo.deleteById(orderId);
		
	}

	@Override
	public RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r) {
		return repo.save(r);
//if(repo.exitsById(r.getOrderId())) {
//			
//			return repo.update(r);
//			}
//			else {
//				throw new UserNotFoundException("user doesn't exist");
//			}

	}


	@Override
	public List<Supplier> getAllSupplierIds() {

		return null;
	}


	@Override
	public Supplier getSupplierById(String orderId) {
	
		return null;
	}


}