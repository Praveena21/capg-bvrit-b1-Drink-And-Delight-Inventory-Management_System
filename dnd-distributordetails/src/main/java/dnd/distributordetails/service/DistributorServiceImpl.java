package dnd.distributordetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dnd.distributordetails.Repo.DistributorRepo;
import dnd.distributordetails.exception.DistributorIdAlreadyExistException;
import dnd.distributordetails.exception.DistributorIdNotFoundException;
import dnd.distributordetails.model.DistributorEntity;

@Service
public class DistributorServiceImpl implements DistributorService{

	@Autowired
	DistributorRepo repo;
    @Autowired
    //RestTemplate restTemplate;
    
	public DistributorEntity addDistributorDetails(DistributorEntity details) {
    	if(repo.existsById(details.getDistributorId())) {
			throw new DistributorIdAlreadyExistException("Distributor with id : ["+details.getDistributorId()+"]Already Exist");
		}
		return repo.save(details);
	}

	public boolean deleteDistributorDetails(int distributorId) {
		repo.deleteById(distributorId);
		return (!repo.existsById(distributorId));
	}
	
	

	public DistributorEntity getDistributorDetails(int distributorId) {
		if(!repo.existsById(distributorId)) {
			throw new DistributorIdNotFoundException("Distributor with id : ["+distributorId+"]Not Found");
		}
		return repo.getOne(distributorId);
	}

	public List<DistributorEntity> getAllDistributorDetails() {	
		return repo.findAll();
	}

	@Override
	public DistributorEntity updateDistributor(DistributorEntity distributor) {
     DistributorEntity d = repo.getOne(distributor.getDistributorId());
         d.setName(distributor.getName());
         d.setAddress(distributor.getAddress());
         d.setPhoneNo(distributor.getPhoneNo());
                return d;
	}
}