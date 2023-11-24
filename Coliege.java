package com.tns.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* Created by- VallapuKhathyayani
 * Date Created-21/11/2023
 */

@Entity
@Table(name="college")
public class College {
	@Id
	long id;
	User collegeAdmin;
	String collegeName;
	String location;
	public College(long id,User collegeAdmin,String collegeName,String location) {
		this.id=id;
		this.collegeAdmin=collegeAdmin;
		this.collegeName=collegeName;
		this.location=location;
			
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

	

}

