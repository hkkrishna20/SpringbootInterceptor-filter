package com.test.dozer_spring.dozer_spring.model;
public class StudentVO {
 
    String name;
    String batchName;
    String homeAddress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", batchName=" + batchName + ", homeAddress=" + homeAddress + "]";
	}
 
    //Getters and Setters
}