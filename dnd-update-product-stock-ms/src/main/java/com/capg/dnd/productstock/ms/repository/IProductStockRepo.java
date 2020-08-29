package com.capg.dnd.productstock.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.dnd.productstock.ms.model.ProductStock;

public interface IProductStockRepo extends JpaRepository<ProductStock,String>{

}
