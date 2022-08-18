package com.alice;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "forms")
public class FormModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private byte[] screenshot;
	
	public FormModel(String name, String email, byte[] screenshot) {
		super();
		this.name = name;
		this.email = email;
		this.screenshot = screenshot;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public byte[] getScreenshot() {
		return screenshot;
	}
	public void setScreenshot(byte[] screenshot) {
		this.screenshot = screenshot;
	}
	@Override
	public String toString() {
		return "FormModel [id=" + id + ", name=" + name + ", email=" + email + ", screenshot="
				+ Arrays.toString(screenshot) + "]";
	}
	
	
}
