

/**
	* Project Name : Drink And Delight Inventory Management System
	*
	* 
**/



package com.capg.dnd.productstock.ms.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.springframework.format.annotation.DateTimeFormat;
/**
* The Product Stock Model class 
*
* @author   :Devu Om SriDatta Sai Swaroop
* @version  :1.0
* @since    :2020-08-13 
**/

@Entity

public class ProductStock {
	@Id
	private String orderId;
	private String productName;
	private double pricePerUnit;
	private double quantityValue;
	
	private double totalPrice;
	private String warehouseID;
	private Date deliveryDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
     private Date manufacturingDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date expiryDate;
	private String qualityCheck;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date processDate;
	public ProductStock() {
		super();
		
	}
	
	public ProductStock(String orderId, String productName, double totalPrice) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.totalPrice = totalPrice;
	}
	

	public ProductStock(String orderId, String productName) {
		super();
		this.orderId = orderId;
		this.productName = productName;
	}

	public ProductStock(String orderId, Date manufacturingDate, Date expiryDate, String qualityCheck) {
		super();
		this.orderId = orderId;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
	}

	public ProductStock(String orderId, String productName, double pricePerUnit, double quantityValue,
			double totalPrice, String warehouseID, Date deliveryDate, Date manufacturingDate, Date expiryDate,
			String qualityCheck, Date processDate) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.totalPrice = totalPrice;
		this.warehouseID = warehouseID;
		this.deliveryDate = deliveryDate;
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

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
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
				+ ", deliveryDate=" + deliveryDate + ", manufacturingDate=" + manufacturingDate + ", expiryDate="
				+ expiryDate + ", qualityCheck=" + qualityCheck + ", processDate=" + processDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((manufacturingDate == null) ? 0 : manufacturingDate.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((processDate == null) ? 0 : processDate.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((qualityCheck == null) ? 0 : qualityCheck.hashCode());
		temp = Double.doubleToLongBits(quantityValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((warehouseID == null) ? 0 : warehouseID.hashCode());
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
		ProductStock other = (ProductStock) obj;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (manufacturingDate == null) {
			if (other.manufacturingDate != null)
				return false;
		} else if (!manufacturingDate.equals(other.manufacturingDate))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
			return false;
		if (processDate == null) {
			if (other.processDate != null)
				return false;
		} else if (!processDate.equals(other.processDate))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (qualityCheck == null) {
			if (other.qualityCheck != null)
				return false;
		} else if (!qualityCheck.equals(other.qualityCheck))
			return false;
		if (Double.doubleToLongBits(quantityValue) != Double.doubleToLongBits(other.quantityValue))
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
			return false;
		if (warehouseID == null) {
			if (other.warehouseID != null)
				return false;
		} else if (!warehouseID.equals(other.warehouseID))
			return false;
		return true;
	}
		
}
