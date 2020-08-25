package com.capg.dnd.rawmaterialstock.ms.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


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
//		// TODO Auto-generated method stub
//		RawMaterialStock oldstock=repo.getOne(newstock.getOrderId());
//		oldstock.setManufactuingDate(newstock.getManufactuingDate());
//		oldstock.setExpiryDate(newstock.getExpiryDate());
//		oldstock.setQualityCheck(newstock.getQualityCheck());
//		return repo.save(newstock);
		
		RawMaterialOrder order = rt.getForObject("http://localhost:8030/RawMaterialOrder/id/"+newStock.getOrderId(), RawMaterialOrder.class);
	//	if( order.getOrderId()==newStock.getOrderId()) {
		System.out.println(newStock);
		System.out.println(order);
			tempStock.setOrderId(newStock.getOrderId());	
			tempStock.setName(newStock.getName());
			tempStock.setPricePerUnit(newStock.getPricePerUnit());
			tempStock.setQuantityValue(newStock.getQuantityValue());
			tempStock.setPrice(newStock.getPrice());
			tempStock.setWarehouseId(newStock.getWarehouseId());
			
    //ProductStock oldStock=repo.getOne(newStock.getOrderId());
	//validateExpiryDate(newStock.getManufactuingDate(), newStock.getExpiryDate());
	tempStock.setManufactuingDate(newStock.getManufactuingDate());
	tempStock.setExpiryDate(newStock.getExpiryDate());
	tempStock.setQualityCheck(newStock.getQualityCheck());
	
	System.out.println("tempStock"+tempStock);
	return repo.save(tempStock);
//	}
//		else return null;
	}
//	public static boolean validateExpiryDate(Date manufacturingDate, Date expiryDate) {// throws
//																						// InvalidExpiryDateException {
//
//		// if(manufacturingDate < LocalDateTime.now())
//
//		return false;

	//}

}
