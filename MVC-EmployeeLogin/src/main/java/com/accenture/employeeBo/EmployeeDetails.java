package com.accenture.employeeBo;

public class EmployeeDetails extends EmployeeLogin {


	private String address;
	private long phoneNo;
	private String projectDetails;


	

	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public long getPhoneNo() {
		return phoneNo;
	}




	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}




	public String getProjectDetails() {
		return projectDetails;
	}




	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}




	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + ", phoneNo=" + phoneNo + ", projectDetails=" + projectDetails
				+ ", getId()=" + getId() + ", getUserName()=" + getUserName() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
