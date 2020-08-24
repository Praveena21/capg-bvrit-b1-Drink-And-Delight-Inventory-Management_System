package com.capg.dnd.rawmaterial.ms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.dnd.rawmaterial.ms.model.RawMaterialOrderDetails;
import com.capg.dnd.rawmaterial.ms.repo.RawMaterialOrderDetailsRepo;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class RawMaterialOrderDetailsServiceImplTest {
@Autowired
RawMaterialOrderDetailsRepo repo;	
@Autowired
RawMaterialOrderDetailsServiceImpl service;
RawMaterialOrderDetails order;
@BeforeAll
void initAdd() {
	order=new RawMaterialOrderDetails("999","laptop");
	if(!repo.existsById("999")) {
		service.addRawMaterialOrder(order);
	}
}
	@Test
	void testAddRawMaterialOrder() {
		RawMaterialOrderDetails sentOrder=new RawMaterialOrderDetails("777","tv");
		RawMaterialOrderDetails addMaterialOrderDetails=service.addRawMaterialOrder(sentOrder);
			}

//	@Test
//	void testGetAllRawMaterialOrders() {
//        
//
//	}

	@Test
	void testGetRawMaterialOrderDetailById() {
		assertTrue(service.getRawMaterialOrderDetailById("999")!=null);
	}
//
//	@Test
//	void testDeleteRawMaterialOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateRawMaterialOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllSupplierIds() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetSupplierById() {
//		fail("Not yet implemented");
//	}

}
