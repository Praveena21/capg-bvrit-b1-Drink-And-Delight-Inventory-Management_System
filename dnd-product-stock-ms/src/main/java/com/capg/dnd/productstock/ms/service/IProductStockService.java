package com.capg.dnd.productstock.ms.service;

import java.util.List;

import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.NoProductStocksAreAvailableException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductStock;

public interface IProductStockService {
	
	public ProductStock addProductStock(ProductStock stock) throws ProductOrderIdAlreadyExistsException;
	public boolean deleteProductStock(String orderId) throws ProductOrderIdNotFoundException;
	public ProductStock getProductStockDetails(String orderId) throws ProductOrderIdNotFoundException;
	public List<ProductStock> getAllProductStockDetails() throws NoProductStocksAreAvailableException;
	public ProductStock updateProductStockDetails(ProductStock newStock) throws ProductOrderIdNotFoundException, InvalidExpiryDateException;
	//public String updateProcessDate(String OrderId) throws ProductOrderIdNotFoundException;

}
