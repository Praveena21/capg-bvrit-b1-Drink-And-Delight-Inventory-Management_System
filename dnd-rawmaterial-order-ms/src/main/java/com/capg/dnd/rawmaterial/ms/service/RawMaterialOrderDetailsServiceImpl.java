package com.capg.dnd.rawmaterial.ms.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.rawmaterial.ms.repo.*;
import com.capg.dnd.rawmaterial.ms.exceptions.IdAlreadyExistsException;
import com.capg.dnd.rawmaterial.ms.exceptions.IdNotFoundException;
import com.capg.dnd.rawmaterial.ms.model.*;


@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsRepo repo;
	

	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		//return repo.save(r);
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
		//return repo.getOne(orderId);
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
	}


}