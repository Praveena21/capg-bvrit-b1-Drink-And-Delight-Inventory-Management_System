package com.capg.dnd.productorder.ms.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class ProductOrder {

	@Id
	
	private String orderId;
	private String name;
    private String supplierId;
    private double quantityValue;
    private String quantityUnit;
    public ProductOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfDelivery == null) ? 0 : dateOfDelivery.hashCode());
		result = prime * result + ((dateOfOrder == null) ? 0 : dateOfOrder.hashCode());
		result = prime * result + ((deliveryStatus == null) ? 0 : deliveryStatus.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quantityUnit == null) ? 0 : quantityUnit.hashCode());
		temp = Double.doubleToLongBits(quantityValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((warehouseId == null) ? 0 : warehouseId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductOrder other = (ProductOrder) obj;
		if (dateOfDelivery == null) {
			if (other.dateOfDelivery != null)
				return false;
		} else if (!dateOfDelivery.equals(other.dateOfDelivery))
			return false;
		if (dateOfOrder == null) {
			if (other.dateOfOrder != null)
				return false;
		} else if (!dateOfOrder.equals(other.dateOfOrder))
			return false;
		if (deliveryStatus == null) {
			if (other.deliveryStatus != null)
				return false;
		} else if (!deliveryStatus.equals(other.deliveryStatus))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
			return false;
		if (quantityUnit == null) {
			if (other.quantityUnit != null)
				return false;
		} else if (!quantityUnit.equals(other.quantityUnit))
			return false;
		if (Double.doubleToLongBits(quantityValue) != Double.doubleToLongBits(other.quantityValue))
			return false;
		if (supplierId == null) {
			if (other.supplierId != null)
				return false;
		} else if (!supplierId.equals(other.supplierId))
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
			return false;
		if (warehouseId == null) {
			if (other.warehouseId != null)
				return false;
		} else if (!warehouseId.equals(other.warehouseId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", name=" + name + ", supplierId=" + supplierId + ", quantityValue="
				+ quantityValue + ", quantityUnit=" + quantityUnit + ", dateOfOrder=" + dateOfOrder
				+ ", dateOfDelivery=" + dateOfDelivery + ", pricePerUnit=" + pricePerUnit + ", totalPrice=" + totalPrice
				+ ", deliveryStatus=" + deliveryStatus + ", warehouseId=" + warehouseId + ", getOrderId()="
				+ getOrderId() + ", getName()=" + getName() + ", getSupplierId()=" + getSupplierId()
				+ ", getQuantityValue()=" + getQuantityValue() + ", getQuantityUnit()=" + getQuantityUnit()
				+ ", getDateOfOrder()=" + getDateOfOrder() + ", getDateOfDelivery()=" + getDateOfDelivery()
				+ ", getPricePerUnit()=" + getPricePerUnit() + ", getTotalPrice()=" + getTotalPrice()
				+ ", getDeliveryStatus()=" + getDeliveryStatus() + ", getWarehouseId()=" + getWarehouseId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
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
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateOfOrder;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateOfDelivery;
    private double pricePerUnit;
    private double totalPrice;
    private String deliveryStatus;
    private String warehouseId;
    
}
