package com.tele.OneToManyProj;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Courses {
	@Id
	private int course_id;
	private String name;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse_id1(int course_id2) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
