package com.capg.dnd.distributordetails.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.distributordetails.exception.DistributorIdAlreadyExistException;
import com.capg.dnd.distributordetails.exception.DistributorIdNotFoundException;
import com.capg.dnd.distributordetails.model.Distributor;
import com.capg.dnd.distributordetails.repo.DistributorRepo;
@Service
public  class DistributorServiceImpl implements DistributorService{

	@Autowired
	DistributorRepo repo;

	public Distributor addDistributor(Distributor distributor) {
		if(repo.existsById(distributor.getDistributorId())) {
			throw new DistributorIdAlreadyExistException("Distributor with id : ["+distributor.getDistributorId()+"]Already Exist");
		}
		return repo.save(distributor);
}
	
public boolean deleteDistributor(Integer distributorId) {
		repo.deleteById(distributorId);
		return (!repo.existsById(distributorId));
	}
	public Distributor getDistributor(Integer distributorId) {
		if(!repo.existsById(distributorId)) {
			throw new DistributorIdNotFoundException("Distributor with id : ["+distributorId+"]Not Found");
		
		}
		return repo.getOne(distributorId);
	}
	
	public List<Distributor> getAllDistributors(){
		return repo.findAll();
	}
	
	@Override
	public Distributor updateDistributor(Distributor distributor) {
		Distributor oldsupplier = repo.getOne(distributor.getDistributorId());
		oldsupplier.setName(distributor.getName());
        oldsupplier.setAddress(distributor.getAddress());
         oldsupplier.setPhoneNo(distributor.getPhoneNo());
return oldsupplier;
	}

	
}