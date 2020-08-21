package dnd.distributordetails.model;


import java.sql.Date;
public class ProductOrder {

private String orderId;
private String name;
private String supplierId;
private double quantityValue;
private String quantityUnit;
private Date dateofOrder;
private Date dateofDelivery;
public String getOrderId() {
return orderId;
}
	
public ProductOrder(String orderId, String name, String supplierId, double quantityValue,
			String quantityUnit, Date dateofOrder, Date dateofDelivery, double pricePerunit, double totalPrice,
			String deliveryStatus, String warehouseId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.supplierId = supplierId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.dateofOrder = dateofOrder;
		this.dateofDelivery = dateofDelivery;
		this.pricePerunit = pricePerunit;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
		this.warehouseId = warehouseId;
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
public Date getDateofOrder() {
	return dateofOrder;
}
public void setDateofOrder(Date dateofOrder) {
	this.dateofOrder = dateofOrder;
}
public Date getDateofDelivery() {
	return dateofDelivery;
}
public void setDateofDelivery(Date dateofDelivery) {
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
private double pricePerunit;
private double totalPrice;
private String deliveryStatus;
private String warehouseId;
@Override
public String toString() {
	return "ProductOrderService [orderId=" + orderId + ", name=" + name + ", supplierId=" + supplierId
			+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", dateofOrder=" + dateofOrder
			+ ", dateofDelivery=" + dateofDelivery + ", pricePerunit=" + pricePerunit + ", totalPrice=" + totalPrice
			+ ", deliveryStatus=" + deliveryStatus + ", warehouseId=" + warehouseId + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dateofDelivery == null) ? 0 : dateofDelivery.hashCode());
	result = prime * result + ((dateofOrder == null) ? 0 : dateofOrder.hashCode());
	result = prime * result + ((deliveryStatus == null) ? 0 : deliveryStatus.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
	long temp;
	temp = Double.doubleToLongBits(pricePerunit);
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
	if (dateofDelivery == null) {
		if (other.dateofDelivery != null)
			return false;
	} else if (!dateofDelivery.equals(other.dateofDelivery))
		return false;
	if (dateofOrder == null) {
		if (other.dateofOrder != null)
			return false;
	} else if (!dateofOrder.equals(other.dateofOrder))
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
	if (Double.doubleToLongBits(pricePerunit) != Double.doubleToLongBits(other.pricePerunit))
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
}