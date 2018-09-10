package com.accenture.employeeCommand;

public class EmployeeCommand {
	
	private int id;
	private String userName;
	private String address;
	private long phoneNo;
	private String projectDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
		return "EmployeeCommand [id=" + id + ", userName=" + userName + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", projectDetails=" + projectDetails + "]";
	}
	
	
	
	

}
