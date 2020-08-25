package com.capg.dnd.productstock.ms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ProductStock;
import com.capg.dnd.productstock.ms.repository.IProductStockRepo;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class ProductStockServiceTest {
	@Autowired
	ProductStockService service;
	@Autowired
	IProductStockRepo repo;
	
	ProductStock stock;
	
	@BeforeAll
	void addSampleStock() throws ProductOrderIdAlreadyExistsException {
		stock =new ProductStock("4009", "tablet");
		if(!repo.existsById("4009")) {
			service.addProductStock(stock);
			
		}
	}

	@Test
	void testAddProductStock() throws ProductOrderIdAlreadyExistsException {
	ProductStock sentStock=new ProductStock("4010", "Ipad");
	ProductStock addProductStock= service.addProductStock(sentStock);
	assertEquals(sentStock,addProductStock);
	}

	

	@Test
	void testGetProductStockDetails() throws ProductOrderIdNotFoundException {
		assertTrue(service.getProductStockDetails("4009")!=null);
	}

	}
























//
//@Test
//void testDeleteProductStock() {
//	fail("Not yet implemented");
//}
//@Test
//void testGetAllProductStockDetails() {
//	fail("Not yet implemented");
//}
//
//@Test
//void testUpdateProductStockDetails() {
//	fail("Not yet implemented");
//}
//
//@Test
//void testUpdateProcessDate() {
//	fail("Not yet implemented");
//}

