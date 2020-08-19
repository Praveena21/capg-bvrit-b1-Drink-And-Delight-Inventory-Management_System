package dnd.distributordetails.service;


import dnd.distributordetails.model.DistributorEntity;

public interface DistributorService{

	public DistributorEntity addDistributorDetails(DistributorEntity details);
	
	public boolean deleteDistributorDetails(int distributorId);
	
	public DistributorEntity getDistributorDetails(int distributorId);

    public DistributorEntity updateDistributor(DistributorEntity distributor);

}
