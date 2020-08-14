package com.capg.dnd.supplier.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dnd.supplier.ms.model.SupplierModel;

public interface SupplierRepo extends JpaRepository<SupplierModel,Long>{

}
