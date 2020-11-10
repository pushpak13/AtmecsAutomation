package com.atmecs.hb.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class EmployeeOneToMany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employee_id;



	@Column(name = "full_Name")
	private String fullName;

	@Column(name = "email")
	private String email;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Skills> skills;


	public EmployeeOneToMany(String fullName, String email) {
		super();
		this.fullName = fullName;
		this.email = email;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Skills> getSkills() {
		return skills;
	}


	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}

}
