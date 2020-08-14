package com.capg.dnd.rawmaterialstock.ms.service;

import java.util.List;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;

public interface IUpdateRMStockService {
	
	public RawMaterialStock addRawMaterialStock(RawMaterialStock stock);
	public boolean deleteRawMaterialStock(String orderId);
	public RawMaterialStock getRawMaterialStockDetails(String orderId);
	public List<RawMaterialStock> getAllRawMaterialStockDetails();
	public RawMaterialStock updateRawMaterialStock(RawMaterialStock newstock) ;
	

}
