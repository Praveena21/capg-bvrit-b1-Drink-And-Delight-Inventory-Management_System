package dnd.display.track.orderdetails.service;

import dnd.display.track.orderdetails.model.SupplierEntity;

public interface SupplierService{

	public SupplierEntity addSupplierDetails(SupplierEntity details);
	
	public boolean deleteSupplierDetails(int supplierId);
	
	public SupplierEntity getSupplierDetails(int supplierId);
	
}
