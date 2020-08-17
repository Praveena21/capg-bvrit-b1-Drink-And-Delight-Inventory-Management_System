package com.capg.dnd.supplier.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.dnd.supplier.ms.model.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier,Long>{

}
