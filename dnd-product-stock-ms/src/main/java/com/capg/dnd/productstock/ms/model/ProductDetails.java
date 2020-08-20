package com.capg.dnd.productstock.ms.model;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductDetails {
	@Id
	private String orderId;
	private String productName;
	private double pricePerUnit;
	private double quantityValue;
	private String quantityUnit;
	private double totalPrice;
	private String warehouseID;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date deliveryDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dateofOrder;
	private String distributorId;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
     private Date manufacturingDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date expiryDate;
	private String qualityCheck;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date processDate;

}
