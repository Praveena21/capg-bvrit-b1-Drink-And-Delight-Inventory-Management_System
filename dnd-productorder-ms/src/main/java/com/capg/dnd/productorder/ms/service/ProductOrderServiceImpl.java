package com.capg.dnd.productorder.ms.service;




import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.productorder.ms.exception.ProductOrderIdAlreadyExistsException;
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
	
	@Autowired
	RestTemplate rt;

	@Override
	public ProductOrder addProductOrder(ProductOrder order) throws ProductOrderIdAlreadyExistsException {
		if(repo.existsById(order.getOrderId())) {
			throw new ProductOrderIdAlreadyExistsException("orderId already Exists");
		}
		else {
	return repo.save(order);
		}
	}

	@Override
	public List<ProductOrder> getAllProductOrders() {
		//System.out.println(repo.findAll());
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
	

	@Override
	public DistributorEntity[] fetchDistributorIds() {
DistributorEntity[] distributorList= rt.getForObject("http://localhost:8800/distributor/all", DistributorEntity[].class);
//rt.exchange("http://localhost:8800/distributor/all", HttpMethod.GET, null, new ParameterizedTypeReference<List<DistributorEntity>>() {

System.out.println(distributorList);
		return distributorList;
	}


	@Override
	public DistributorEntity fetchDistributorDetail(int distributorId) {
		DistributorEntity distributorDetail=rt.getForObject("http://localhost:8800/distributor/id/"+distributorId , DistributorEntity.class);
		return distributorDetail;
	}

	@Override
	public ProductOrder update(String orderId, String deliveryStatus) {
		ProductOrder order=repo.getOne(orderId);
		order.setDeliveryStatus(deliveryStatus);
		
		return repo.save(order);
	}


}