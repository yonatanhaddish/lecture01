package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	
	@Id
	@Column(name = "studentId")
	private int studentId;
	
	@Column(name = "courseId")
	private int courseId;
	
	@Column(name = "studentName")
	private String studentName;
	
	@Column(name = "studentEmail")
	private String studentEmail;
	
	@Column(name = "studentPhone")
	private int studentPhone;
	
	
	public Students() {
		
		super();
	}
	
	public Students(int studentId, int courseId, String studentName, String studentEmail, int studentPhone) {
		
		super();
		
		this.studentName = studentName;
		this.courseId = courseId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getCourseId() {
		return this.courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return this.studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public int getStudentPhone() {
		return this.studentPhone;
	}
	public void setStudentPhone(int studentPhone) {
		this.studentPhone = studentPhone;
	}
		
}
