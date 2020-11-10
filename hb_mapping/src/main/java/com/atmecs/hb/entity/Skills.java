package com.atmecs.hb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skills")

public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skills_id")
	private int skills_id;

	@Column(name = "skill")
	private String skill;

	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "employee_id")
	private EmployeeOneToOne employee ;

	public Skills() {
	}

	public Skills(String skill) {
		super();
		this.skill = skill;
		
	}

	

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public EmployeeOneToOne getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeOneToOne employee) {
		this.employee = employee;
	}

	
	
	

	

}


