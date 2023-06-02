package com.student.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Student {

	@Id
	private int rollno;
	private String sname;
	private String date_of_addmission;
	private int year_of_passout;
	private double percentage;
	
	private final String cname = "D Y Patil College of akurdi";
	
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getDate_of_addmission() {
		return date_of_addmission;
	}
	
	public void setDate_of_addmission(String date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public String getCname() {
		return cname;
	}
	
	public int getYear_of_passout() {
		return year_of_passout;
	}

	public void setYear_of_passout(int year_of_passout) {
		this.year_of_passout = year_of_passout;
	}

	
}
