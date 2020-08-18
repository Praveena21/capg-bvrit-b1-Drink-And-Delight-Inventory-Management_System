package com.capg.dnd.supplier.ms.service;

import java.util.List;

import com.capg.dnd.supplier.ms.model.Supplier;

public interface SupplierService{

    public Supplier addSupplier(Supplier suplier);
	public boolean deleteSupplier(Long supplierId);
	public Supplier getSupplierById(Long supplierId);
			
	public Supplier updateSupplier(Supplier supplier);
	public List<Supplier> getAllSupplier();
	
}
