package dnd.display.track.orderdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dnd.display.track.orderdetails.DAO.SupplierDAO;
import dnd.display.track.orderdetails.model.SupplierEntity;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	SupplierDAO repo;

	public SupplierEntity addSupplierDetails(SupplierEntity details) {
		return repo.save(details);
	}

	public boolean deleteSupplierDetails(int supplierId) {
		repo.deleteById(supplierId);
		return (!repo.existsById(supplierId));
	}

	public SupplierEntity getSupplierDetails(int supplierId) {
		return repo.getOne(supplierId);
	}

	public List<SupplierEntity> getAllSupplierDetails() {	
		return repo.findAll();
	}
	
}
