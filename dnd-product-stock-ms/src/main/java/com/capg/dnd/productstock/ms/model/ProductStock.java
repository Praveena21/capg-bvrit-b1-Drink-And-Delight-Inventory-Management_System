package com.capg.dnd.productstock.ms.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.springframework.format.annotation.DateTimeFormat;
@Entity

public class ProductStock {
	@Id
	private String orderId;
	private String productName;
	private double pricePerUnit;
	private double quantityValue;
	//private String quantityUnit;
	private double totalPrice;
	private String warehouseID;
	//private Date deliveryDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
     private Date manufacturingDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date expiryDate;
	private String qualityCheck;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date processDate;
	public ProductStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductStock(String orderId, String productName, double pricePerUnit, double quantityValue,
			double totalPrice, String warehouseID, Date manufacturingDate, Date expiryDate, String qualityCheck,
			Date processDate) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.totalPrice = totalPrice;
		this.warehouseID = warehouseID;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	@Override
	public String toString() {
		return "ProductStock [orderId=" + orderId + ", productName=" + productName + ", pricePerUnit=" + pricePerUnit
				+ ", quantityValue=" + quantityValue + ", totalPrice=" + totalPrice + ", warehouseID=" + warehouseID
				+ ", manufacturingDate=" + manufacturingDate + ", expiryDate=" + expiryDate + ", qualityCheck="
				+ qualityCheck + ", processDate=" + processDate + "]";
	}
	
	
		}
