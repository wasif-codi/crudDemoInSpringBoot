package com.demo.crudop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String sname;
private String scourse;
private int sfees;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScourse() {
	return scourse;
}
public void setScourse(String scourse) {
	this.scourse = scourse;
}
public int getSfees() {
	return sfees;
}
public void setSfees(int sfees) {
	this.sfees = sfees;
}

}
