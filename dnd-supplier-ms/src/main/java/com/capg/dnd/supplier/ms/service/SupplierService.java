package com.capg.dnd.supplier.ms.service;

import java.util.List;

import com.capg.dnd.supplier.ms.model.SupplierModel;

public interface SupplierService{

    public SupplierModel addSupplierDetails(SupplierModel details);
	public boolean deleteSupplierDetails(Long supplierId);
	public SupplierModel getSupplierDetailsById(Long supplierId);
	public List<SupplierModel> getAllSupplierDetails();
	
}
