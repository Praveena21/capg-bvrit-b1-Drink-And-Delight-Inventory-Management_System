package com.capg.dnd.productstock.ms.model;


import java.time.LocalDateTime;



import org.springframework.format.annotation.DateTimeFormat;

public class ProductOrder {
	private String orderId;
	private String name;
	private String distributorId;
	private double quantityValue;
	
	private String quantityUnit;
	@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
	private LocalDateTime dateofOrder;
	@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
	private LocalDateTime dateofDelivery;
	private double pricePerunit;
	private double totalPrice;
	private String deliveryStatus;
	private String warehouseId;
	public ProductOrder() {
		super();
		// TODO Auto-generated constructor stub
	}


public ProductOrder(String orderId, String name, String distributorId, double quantityValue, String quantityUnit,
		LocalDateTime dateofOrder, LocalDateTime dateofDelivery, double pricePerunit, double totalPrice,
		String deliveryStatus, String warehouseId) {
	super();
	this.orderId = orderId;
	this.name = name;
	this.distributorId = distributorId;
	this.quantityValue = quantityValue;
	this.quantityUnit = quantityUnit;
	this.dateofOrder = dateofOrder;
	this.dateofDelivery = dateofDelivery;
	this.pricePerunit = pricePerunit;
	this.totalPrice = totalPrice;
	this.deliveryStatus = deliveryStatus;
	this.warehouseId = warehouseId;
}


public String getOrderId() {
	return orderId;
}


public void setOrderId(String orderId) {
	this.orderId = orderId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDistributorId() {
	return distributorId;
}


public void setDistributorId(String distributorId) {
	this.distributorId = distributorId;
}


public double getQuantityValue() {
	return quantityValue;
}


public void setQuantityValue(double quantityValue) {
	this.quantityValue = quantityValue;
}


public String getQuantityUnit() {
	return quantityUnit;
}


public void setQuantityUnit(String quantityUnit) {
	this.quantityUnit = quantityUnit;
}


public LocalDateTime getDateofOrder() {
	return dateofOrder;
}


public void setDateofOrder(LocalDateTime dateofOrder) {
	this.dateofOrder = dateofOrder;
}


public LocalDateTime getDateofDelivery() {
	return dateofDelivery;
}


public void setDateofDelivery(LocalDateTime dateofDelivery) {
	this.dateofDelivery = dateofDelivery;
}


public double getPricePerunit() {
	return pricePerunit;
}


public void setPricePerunit(double pricePerunit) {
	this.pricePerunit = pricePerunit;
}


public double getTotalPrice() {
	return totalPrice;
}


public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}


public String getDeliveryStatus() {
	return deliveryStatus;
}


public void setDeliveryStatus(String deliveryStatus) {
	this.deliveryStatus = deliveryStatus;
}


public String getWarehouseId() {
	return warehouseId;
}


public void setWarehouseId(String warehouseId) {
	this.warehouseId = warehouseId;
}


@Override
public String toString() {
	return "ProductOrder [orderId=" + orderId + ", name=" + name + ", distributorId=" + distributorId
			+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", dateofOrder=" + dateofOrder
			+ ", dateofDelivery=" + dateofDelivery + ", pricePerunit=" + pricePerunit + ", totalPrice=" + totalPrice
			+ ", deliveryStatus=" + deliveryStatus + ", warehouseId=" + warehouseId + "]";
}



}