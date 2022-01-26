package com.cg.placementmanagement.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="College")
@NamedQueries(@NamedQuery(name = "getAllData", query = "SELECT c FROM College c"))
public class College  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	public College() {
		
	}
	public College(int id, String collegeAdmin, String collegeName, String location) {
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) {
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
	@Override
	public String toString() {
		return "College [id= " + id + ", collegeAdmin =" + collegeAdmin + ", CollegeName= " + collegeName + ", Location= " + location + "]";
	}
}
