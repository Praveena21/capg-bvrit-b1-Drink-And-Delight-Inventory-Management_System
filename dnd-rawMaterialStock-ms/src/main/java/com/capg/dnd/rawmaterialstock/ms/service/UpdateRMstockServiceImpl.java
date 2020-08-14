package com.capg.dnd.rawmaterialstock.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.repository.IupdatermstockDAO;

@Service
public class UpdateRMstockServiceImpl implements IUpdateRMStockService {
	
	@Autowired
	IupdatermstockDAO repo;
	
	public RawMaterialStock addRawMaterialStock(RawMaterialStock stock) {
		return repo.save(stock);
	}
	
	public boolean deleteRawMaterialStock(String orderId) {
		repo.deleteById(orderId);
		return (!repo.existsById(orderId));
	}
	
	public RawMaterialStock getRawMaterialStockDetails(String orderId) {
		return repo.getOne(orderId);
	}
	
	public List<RawMaterialStock> getAllRawMaterialStockDetails(){
		return repo.findAll();
	}

	public RawMaterialStock updateRawMaterialStock(RawMaterialStock newstock) {
		// TODO Auto-generated method stub
		RawMaterialStock oldstock=repo.getOne(newstock.getOrderId());
		oldstock.setManufactuingDate(newstock.getManufactuingDate());
		oldstock.setExpiryDate(newstock.getExpiryDate());
		oldstock.setQualityCheck(newstock.getQualityCheck());
		return repo.save(newstock);
	}




}
