package com.capg.dnd.rawmaterial.ms.service;



import java.util.List;


import com.capg.dnd.rawmaterial.ms.model.*;


public interface RawMaterialOrderDetailsService
{

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();
	
	List<Supplier> getAllSupplierIds();
	
	Supplier getSupplierById(String orderId);

	RawMaterialOrderDetails getRawMaterialOrderDetailById(String orderId);
	
	void deleteRawMaterialOrder(String orderId);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);
}
