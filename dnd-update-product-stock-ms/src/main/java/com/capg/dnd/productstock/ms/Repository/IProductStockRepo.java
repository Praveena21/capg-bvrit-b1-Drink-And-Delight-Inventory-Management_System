package com.capg.dnd.productstock.ms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.dnd.productstock.ms.model.ProductStock;
@Repository
public interface IProductStockRepo extends JpaRepository<ProductStock, String>{

}
