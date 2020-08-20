package dnd.distributordetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dnd.distributordetails.model.DistributorEntity;

public interface DistributorRepo extends JpaRepository<DistributorEntity,Integer>{

}
