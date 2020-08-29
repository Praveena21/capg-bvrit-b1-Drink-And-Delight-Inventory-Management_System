package com.capg.dnd.rawmaterial.ms.service;



import java.util.List;





import com.capg.dnd.rawmaterial.ms.model.*;


public interface RawMaterialOrderDetailsService
{

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();

	RawMaterialOrderDetails getRawMaterialOrderDetailById(String orderId);
	
	void deleteRawMaterialOrder(String orderId);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);
	Supplier[] fetchSupplierIds();
	
	Supplier fetchSupplierDetail(int SupplierId);

	RawMaterialOrderDetails update(String orderId, String deliveryStatus);
}
