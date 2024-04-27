package com.springCore.ref;

public class Applicant_details {

	private String type;
	private String address;
	private String appl_name;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAppl_name() {
		return appl_name;
	}

	public void setAppl_name(String appl_name) {
		this.appl_name = appl_name;
	}

	@Override
	public String toString() {
		return "Applicant_details [type=" + type + ", address=" + address + ", appl_name=" + appl_name + "]";
	}

}
