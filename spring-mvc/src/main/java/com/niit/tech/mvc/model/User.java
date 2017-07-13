package com.niit.tech.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Transient
	Long serialVersionUID = 12324999999L;

	@Column(name="name")
	private String name;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;

	public String getName() {
		return name;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
