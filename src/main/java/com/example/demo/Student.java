package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String name;
	private String email;
	public Student() {
		//TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Student(int sid, String name, String email) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
	}
	
	
}
