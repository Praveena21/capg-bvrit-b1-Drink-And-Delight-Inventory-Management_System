package com.capg.dnd.supplier.ms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.supplier.ms.exception.SupplierWithIdAlreadyExistException;
import com.capg.dnd.supplier.ms.exception.SupplierWithIdNotFoundException;
import com.capg.dnd.supplier.ms.model.RawMaterialOrder;
import com.capg.dnd.supplier.ms.model.Supplier;
import com.capg.dnd.supplier.ms.repo.SupplierRepo;
@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierRepo repo;
	
	
	public Supplier addSupplier(Supplier supplier) {
		if(repo.existsById(supplier.getSupplierId())) {
			throw new SupplierWithIdAlreadyExistException("Supplier with id : ["+supplier.getSupplierId()+"]Already Exist");
		}
		else {
		return repo.save(supplier);
		}
}
	
public boolean deleteSupplier(int supplierId) {
		repo.deleteById(supplierId);
		return (!repo.existsById(supplierId));
	}
	public Supplier getSupplierById(int supplierId) {
		if(!repo.existsById(supplierId)) {
			throw new SupplierWithIdNotFoundException("Supplier with id : ["+supplierId+"]Not Found");
		
		}
		return repo.getOne(supplierId);
	}
	
	public List<Supplier> getAllSupplier(){
		return repo.findAll();
	}
	
	@Override
	public Supplier updateSupplier(Supplier supplier) {
		Supplier oldsupplier = repo.getOne(supplier.getSupplierId());
		oldsupplier.setName(supplier.getName());
        oldsupplier.setAddress(supplier.getAddress());
         oldsupplier.setPhoneNo(supplier.getPhoneNo());
return oldsupplier;
	}


		
}