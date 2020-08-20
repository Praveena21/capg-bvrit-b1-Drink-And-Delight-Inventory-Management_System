package com.capg.dnd.productorder.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dnd.productorder.ms.model.*;

public interface IProductOrderRepo extends JpaRepository<ProductOrder, String> {

}