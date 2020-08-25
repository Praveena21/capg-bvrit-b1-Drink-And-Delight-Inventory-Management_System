package com.capg.dnd.productorder.ms.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Supplier {

	
	private Long supplierId;
	private String name;
	private String address;
	private Long phoneNo;
	
	public Supplier(Long supplierId, String name, String address, long phoneNo) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.address = address;
		this.phoneNo= phoneNo;
	}

	public Supplier() {
		super();
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getphoneNo() {
		return phoneNo;
	}

	public void setphoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "SupplierModel [supplierId=" + supplierId + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + ", getSupplierId()=" + getSupplierId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getphoneNo()=" + getphoneNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}