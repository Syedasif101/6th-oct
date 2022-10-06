package com.tele.OneToManyProj;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="Trainer")
public class Teacher {
	@Id
	@PrimaryKeyJoinColumn
	private int t_id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	List<Courses> courses=new ArrayList<>();
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	

}
