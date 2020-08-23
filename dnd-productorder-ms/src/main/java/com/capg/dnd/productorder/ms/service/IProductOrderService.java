package com.capg.dnd.productorder.ms.service;

import java.util.List;
import java.util.Optional;

import com.capg.dnd.productorder.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productorder.ms.model.ProductOrder;

public interface IProductOrderService {



		ProductOrder addProductOrder(ProductOrder order) throws ProductOrderIdAlreadyExistsException;

		List<ProductOrder> getAllProductOrders();

		ProductOrder getProductOrderDetailById(String orderId);
		
		void deleteProductOrder(String orderId);

		ProductOrder updateProductOrder(ProductOrder order);
	}

