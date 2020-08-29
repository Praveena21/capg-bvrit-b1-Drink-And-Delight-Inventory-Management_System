package com.capg.dnd.rawmaterialstock.ms.service;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.rawmaterialstock.ms.exception.RmIdNotFoundException;
import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialOrder;
import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.repository.IupdatermstockDAO;

@Service
public class UpdateRMstockServiceImpl implements IUpdateRMStockService {

	@Autowired
	IupdatermstockDAO repo;
	@Autowired
	RestTemplate rt;
@Autowired
	RawMaterialStock tempStock;

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

	public List<RawMaterialStock> getAllRawMaterialStockDetails() {
		return repo.findAll();
	}

	public RawMaterialStock updateRawMaterialStock(RawMaterialStock newStock) {
		System.out.println("hellp stock");
		RawMaterialOrder order = rt.getForObject("http://localhost:8030/RawMaterialOrder/id/"+newStock.getOrderId(), RawMaterialOrder.class);

if(order.getOrderId().equals(newStock.getOrderId())){
   tempStock.setOrderId(newStock.getOrderId());
	tempStock.setManufactuingDate(newStock.getManufactuingDate());
	tempStock.setExpiryDate(newStock.getExpiryDate());
	tempStock.setQualityCheck(newStock.getQualityCheck());
	
	System.out.println("tempStock"+tempStock);
	return repo.save(tempStock);
	}
else
	throw new RmIdNotFoundException("orderId don't exist");

}
	}
