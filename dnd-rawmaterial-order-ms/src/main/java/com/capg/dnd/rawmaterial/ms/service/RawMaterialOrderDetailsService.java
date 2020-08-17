package com.capg.dnd.rawmaterial.ms.service;



import java.util.List;
import java.util.Optional;

import com.capg.dnd.rawmaterial.ms.model.*;


public interface RawMaterialOrderDetailsService
{

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	List<RawMaterialOrderDetails> getAllRawMaterialOrders();
//	Optional<SupplierDetails> getSuplierDetails(int order_id);

	Optional<RawMaterialOrderDetails> getRawMaterialOrderDetailById(int orderId);
	
	void deleteRawMaterialOrder(int orderId);

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);
}
