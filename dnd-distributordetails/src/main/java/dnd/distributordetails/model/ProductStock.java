package dnd.distributordetails.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class ProductStock {
	@Id
	private String orderId;
	private String name;
	private double pricePerUnit;
	private double quantityValue;
	private String quantityUnit;
	private double price;
	private String warehouseID;
	private Date deliveryDate;
	private Date manufacturingDate;
	private Date expiryDate;
	private String qualityCheck;
	private Date processDate;
	public ProductStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductStock(String orderId, String name, double pricePerUnit, double quantityValue, String quantityUnit,
			double price, String warehouseID, Date deliveryDate, Date manufacturingDate, Date expiryDate,
			String qualityCheck, Date processDate) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
		return "ProductStock [orderId=" + orderId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
				+ ", warehouseID=" + warehouseID + ", deliveryDate=" + deliveryDate + ", manufacturingDate="
				+ manufacturingDate + ", expiryDate=" + expiryDate + ", qualityCheck=" + qualityCheck + ", processDate="
				+ processDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((manufacturingDate == null) ? 0 : manufacturingDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((processDate == null) ? 0 : processDate.hashCode());
		result = prime * result + ((qualityCheck == null) ? 0 : qualityCheck.hashCode());
		result = prime * result + ((quantityUnit == null) ? 0 : quantityUnit.hashCode());
		temp = Double.doubleToLongBits(quantityValue);
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
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
			return false;
		if (processDate == null) {
			if (other.processDate != null)
				return false;
		} else if (!processDate.equals(other.processDate))
			return false;
		if (qualityCheck == null) {
			if (other.qualityCheck != null)
				return false;
		} else if (!qualityCheck.equals(other.qualityCheck))
			return false;
		if (quantityUnit == null) {
			if (other.quantityUnit != null)
				return false;
		} else if (!quantityUnit.equals(other.quantityUnit))
			return false;
		if (Double.doubleToLongBits(quantityValue) != Double.doubleToLongBits(other.quantityValue))
			return false;
		if (warehouseID == null) {
			if (other.warehouseID != null)
				return false;
		} else if (!warehouseID.equals(other.warehouseID))
			return false;
		return true;
	}
	
}