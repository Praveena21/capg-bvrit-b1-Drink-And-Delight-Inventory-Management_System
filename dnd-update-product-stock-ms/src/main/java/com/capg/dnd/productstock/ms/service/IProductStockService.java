package com.capg.dnd.productstock.ms.service;

import java.util.List;

import com.capg.dnd.productstock.ms.model.ProductStock;

public interface IProductStockService {
	public ProductStock addProductStock(ProductStock stock);
	public boolean deleteProductStock(String orderId);
	public ProductStock getProductStockDetails(String orderId);
	public List<ProductStock> getAllProductStockDetails();
	public ProductStock updateProductStockDetails(ProductStock newStock);

}
