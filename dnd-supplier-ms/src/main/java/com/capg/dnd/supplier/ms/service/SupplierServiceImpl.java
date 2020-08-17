package com.capg.dnd.supplier.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.supplier.ms.exception.SupplierWithIdNotFoundException;
import com.capg.dnd.supplier.ms.model.Supplier;
import com.capg.dnd.supplier.ms.repo.SupplierRepo;
@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierRepo repo;
	
	public Supplier addSupplier(Supplier supplier) {
		return repo.save(supplier);
}
	
public boolean deleteSupplier(Long supplierId) {
		repo.deleteById(supplierId);
		return (!repo.existsById(supplierId));
	}
	public Supplier getSupplierById(Long supplierId) {
		if(!repo.existsById(supplierId)) {
			throw new SupplierWithIdNotFoundException("Supplier with id : ["+supplierId+"]Not Found");
		
		}
		return repo.getOne(supplierId);
	}
	
	public List<Supplier> getAllSupplier(){
		return repo.findAll();
	}

	
	public Supplier updateSupplier(Supplier newsupplier) {
		Supplier oldsupplier = repo.getOne(newsupplier.getSupplierId());
				oldsupplier.setName(newsupplier.getName());
		        oldsupplier.setAddress(newsupplier.getAddress());
		         oldsupplier.setphoneNo(newsupplier.getphoneNo());
		return oldsupplier;
	}
		
}