package com.capg.dnd.productstock.ms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.capg.dnd.productstock.ms.exception.NoProductStocksAreAvailableException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.repository.IProductStockRepo;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class ProductStockServiceTest {
	@Autowired
	IProductStockService service;
	@Autowired
	IProductStockRepo repo;
	
	ProductStock stock;
	
	@BeforeAll
	void addSampleStock() throws ProductOrderIdAlreadyExistsException {
		stock =new ProductStock("5647", "car");
		if(!repo.existsById("5647")) {
			service.addProductStock(stock);
			
		}
	}
	@Test
	void testAddProductStock() throws ProductOrderIdAlreadyExistsException {
		ProductStock sentStock=new ProductStock("3754", "Laptop");
		ProductStock addRawMaterialStock= service.addProductStock(sentStock);
		assertEquals(sentStock,addRawMaterialStock);
	}


	@Test
	void testGetProductStockDetails() throws ProductOrderIdNotFoundException {
		assertTrue(service.getProductStockDetails("5647")!=null);
	}

	@Test
	void testGetAllProductStockDetails() throws NoProductStocksAreAvailableException {
		assertTrue(service.getAllProductStockDetails()!=null);
	}


}
