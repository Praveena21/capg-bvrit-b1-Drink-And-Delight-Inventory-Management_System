package com.capg.dnd.productorder.ms.service;




import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.soap.InitParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.productorder.ms.model.*;
import com.capg.dnd.productorder.ms.repository.*;




@Service
//@Transactional
public class ProductOrderServiceImpl implements IProductOrderService {
  @PostConstruct
  void init() {
	  System.out.println("hello service");
  }
	
	@Autowired
	IProductOrderRepo repo;
	

	@Override
	public ProductOrder addProductOrder(ProductOrder order) {
		// TODO Auto-generated method stub
		return repo.save(order);
	}

	@Override
	public List<ProductOrder> getAllProductOrders() {
		return repo.findAll();
	}

	@Override
	public ProductOrder getProductOrderDetailById(String orderId) {
		return repo.getOne(orderId);
	}

	@Override
	public void deleteProductOrder(String orderId) {
		repo.deleteById(orderId);
		
	}

	@Override
	public ProductOrder updateProductOrder(ProductOrder order) {
		return repo.save(order);
	}


}