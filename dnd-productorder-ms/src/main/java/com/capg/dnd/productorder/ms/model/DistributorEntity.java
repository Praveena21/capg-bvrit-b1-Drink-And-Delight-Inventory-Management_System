package com.capg.dnd.productorder.ms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class DistributorEntity {

	
	private int distributorId;
	private String name;
	private String address;
	private Long phoneNo;
	
	public DistributorEntity() {
		super();
	}

	public DistributorEntity(int distributorrId, String name, String address, Long phoneNo, int distributorId) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
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

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "DistributorEntity [distributorId=" + distributorId + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
}
