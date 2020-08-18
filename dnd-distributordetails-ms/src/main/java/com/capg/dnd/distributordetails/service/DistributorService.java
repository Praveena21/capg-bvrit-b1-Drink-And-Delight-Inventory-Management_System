package com.capg.dnd.distributordetails.service;

import java.util.List;

import com.capg.dnd.distributordetails.model.Distributor;

public interface DistributorService {

	public Distributor addDistributor(Distributor distributor);
	
	public boolean deleteDistributor(Integer distributorId);
	
	public Distributor getDistributor(Integer distributorId);
	
public Distributor updateDistributor(Distributor distributor);
public List<Distributor> getAllDistributors();

}
