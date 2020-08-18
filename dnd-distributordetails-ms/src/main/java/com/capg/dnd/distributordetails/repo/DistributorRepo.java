package com.capg.dnd.distributordetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dnd.distributordetails.model.Distributor;

public interface DistributorRepo extends JpaRepository<Distributor, Integer> {

}
