package com.test.dozer_spring.dozer_spring.model;

import java.util.List;

public class DestinationObject {
     
    private String name;
    public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "DestinationObject [name=" + name + ", address=" + address + ", pupils=" + pupils + "]";
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
	public List<StudentVO> getPupils() {
		return pupils;
	}
	public void setPupils(List<StudentVO> pupils) {
		this.pupils = pupils;
	}
	private String address;
    List<StudentVO> pupils;
 
    //Getters and Setters
}