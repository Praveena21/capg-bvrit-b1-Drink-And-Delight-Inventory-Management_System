package com.capg.productorder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.productorder.ms.model.ProductOrder;

public interface IProductOrderRepo extends JpaRepository<ProductOrder, String> {

}
