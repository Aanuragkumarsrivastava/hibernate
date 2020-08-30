package com.company.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college_details")
public class College 
{

	@Id
	@Column(name="college_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)//id generated in sequence order
	private int id;
	
	@Override
	public String toString() {
		return "College [id=" + id + ", collegename=" + collegename + ", city=" + city + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="college_name")
	private String collegename;
	
	private String city;
}
