package com.test.dozer_spring.dozer_spring.model;

import java.util.ArrayList;
import java.util.List;

public class SourceObject {
 
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
	public List<Student> getStudents() {
		if(students== null) {
			
			this.students = new ArrayList<Student>();
		}
		return students;
	}
	@Override
	public String toString() {
		return "SourceObject [name=" + name + ", address=" + address + ", students=" + students + "]";
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	private String name;
    private String address;
    List<Student> students;
 
    //Getters and Setters
}