package com.capg.dnd.supplier.ms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.dnd.supplier.ms.model.Supplier;
import com.capg.dnd.supplier.ms.repo.SupplierRepo;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class SupplierServiceImplTest {


	@Autowired
	
	SupplierRepo repo;
	@Autowired
	SupplierServiceImpl service;

	Supplier supplier;
	@BeforeAll
	void testSupplier() {
		supplier = new Supplier(1110,"pandu","sangareedy");
		if(!repo.existsById(1110)) {
		service.addSupplier(supplier);
	}
	}
	@Test
	void testAddSupplier() {
		Supplier supplier= new Supplier(3023,"pinky", "secundrabad");
		Supplier addSupplier= service.addSupplier(supplier);
		assertEquals(supplier,addSupplier); 
	}

	

	@Test
	void testGetSupplierById() {
		assertTrue(service.getSupplierById(1110)!=null);
	}

	@Test
	void testGetAllSupplier() {
		assertTrue(service.getAllSupplier()!=null);
	}

}
