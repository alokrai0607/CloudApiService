package com.cloud.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cloud_Table")
public class CloudVender {

	@Id
	
	private String vendorId;

	private String vendorName;

	private String vendorAddress;

	private String vendorPhoneNumber;

	public CloudVender() {
		super();
	}

	public CloudVender(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	@Override
	public String toString() {
		return "CloudVender [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorPhoneNumber=" + vendorPhoneNumber + "]";
	}

}
