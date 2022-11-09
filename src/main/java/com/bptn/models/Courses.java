package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {
	
	@Id
	@Column(name = "courseId")
	private int courseId;
	
	@Column(name = "courseName")
	private String courseName;

	
	public Courses() {
		super();
	}
	
	public Courses(int courseId, String courseName) {
		
		super();
		
		this.courseId = courseId;
		this.courseName = courseName;
	}

	
	public int getCourseId() {
		return this.courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
