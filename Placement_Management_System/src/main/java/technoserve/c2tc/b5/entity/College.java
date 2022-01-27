package technoserve.c2tc.b5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Collegedb")
@Entity
public class College {

	@Id
	private int id;
	
	@Column(name="collegeadmin")
	private String CollegeAdmin;
	
	@Column(name="collegename")
	private String CollegeName;
	
	@Column(name="collegelocation")
	private String CollegeLocation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeAdmin() {
		return CollegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		CollegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public String getCollegeLocation() {
		return CollegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		CollegeLocation = collegeLocation;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", CollegeAdmin=" + CollegeAdmin + ", CollegeNAme=" + CollegeName
				+ ", CollegeLocation=" + CollegeLocation + "]";
	}

	



}
