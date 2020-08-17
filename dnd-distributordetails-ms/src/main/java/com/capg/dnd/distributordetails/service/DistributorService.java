package com.capg.dnd.distributordetails.service;

import com.capg.dnd.distributordetails.model.Distributor;

public interface DistributorService {

	public Distributor addDistributorDetails(Distributor details);
	
	public boolean deleteDistributorDetails(int distributorId);
	
	public Distributor getDistributorDetails(int distributorId);
	

}
