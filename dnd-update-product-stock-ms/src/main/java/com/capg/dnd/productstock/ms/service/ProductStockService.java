package com.capg.dnd.productstock.ms.service;

  import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.dnd.productstock.ms.Repository.IProductStockRepo;
import com.capg.dnd.productstock.ms.model.ProductStock;
@Service
public class ProductStockService implements IProductStockService {
   IProductStockRepo repo;
	@Override
	public ProductStock addProductStock(ProductStock stock) {
		
		return repo.save(stock);
	}

	@Override
	public boolean deleteProductStock(String orderId) {
		repo.deleteById(orderId);
		return !repo.existsById(orderId);
	}

	@Override
	public ProductStock getProductStockDetails(String orderId) {
		
		return repo.getOne(orderId);
	}

	@Override
	public List<ProductStock> getAllProductStockDetails() {
		
		return repo.findAll();
	}

	@Override
	public ProductStock updateProductStock(ProductStock newStock) {
	ProductStock oldStock=repo.getOne(newStock.getOrderId());
	oldStock.setManufacturingDate(newStock.getManufacturingDate());
	oldStock.setExpiryDate(newStock.getExpiryDate());
	oldStock.setQualityCheck(newStock.getQualityCheck());
	
	
		return repo.save(oldStock);
	}

}
