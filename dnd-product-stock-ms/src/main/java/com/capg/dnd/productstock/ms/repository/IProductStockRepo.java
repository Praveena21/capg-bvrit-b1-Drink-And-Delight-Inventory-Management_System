package com.capg.dnd.productstock.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capg.dnd.productstock.ms.model.ProductStock;

public interface IProductStockRepo extends JpaRepository<ProductStock,String>{

}
