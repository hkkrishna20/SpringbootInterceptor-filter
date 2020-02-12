package com.test.dozer_spring.dozer_spring.model;

public class Student {

	String name;
	String batch;
	String address;

	public Student(String name, String batch, String address) {
		// TODO Auto-generated constructor stub

		this.name = name;
		this.batch = batch;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", batch=" + batch + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getters and Setters
}