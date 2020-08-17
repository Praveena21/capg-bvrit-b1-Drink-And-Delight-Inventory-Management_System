package com.capg.dnd.rawmaterial.ms.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.rawmaterial.ms.repo.*;
import com.capg.dnd.rawmaterial.ms.model.*;


@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsRepo repo;
	

	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		return repo.save(r);
	}

	@Override
	public List<RawMaterialOrderDetails> getAllRawMaterialOrders() {
		return repo.findAll();
	}

	@Override
	public Optional<RawMaterialOrderDetails> getRawMaterialOrderDetailById(int orderId) {
		return repo.findById(orderId);
	}

	@Override
	public void deleteRawMaterialOrder(int orderId) {
		repo.deleteById(orderId);
		
	}

	@Override
	public RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r) {
		return repo.save(r);
	}


}