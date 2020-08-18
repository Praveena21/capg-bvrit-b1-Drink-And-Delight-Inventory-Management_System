package com.capg.dnd.distributordetails.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.distributordetails.model.Distributor;
import com.capg.dnd.distributordetails.repo.DistributorRepo;
@Service
public class DistributorServiceImpl implements DistributorService{

	@Autowired
	DistributorRepo repo;

	public Distributor addDistributorDetails1(Distributor details) {
		return repo.save(details);
	}

	public boolean deleteDistributorDetails1(int distributorId) {
		repo.deleteById(distributorId);
		return (!repo.existsById(distributorId));
	}
	
	

	public Distributor getDistributorDetails1(int distributorId) {
		return repo.getOne(distributorId);
	}

	public List<Distributor> getAllDistributorDetails() {	
		return repo.findAll();
	}

	@Override
	public Distributor addDistributorDetails(Distributor details) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDistributorDetails(int distributorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Distributor getDistributorDetails(int distributorId) {
		// TODO Auto-generated method stub
		return null;
	}
}