package com.capg.dnd.distributordetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.dnd.distributordetails.model.Distributor;

@Repository
public interface DistributorRepo extends JpaRepository<Distributor, Integer> {

}
