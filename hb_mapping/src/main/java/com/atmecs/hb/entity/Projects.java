package com.atmecs.hb.entity;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")

public class Projects {
	@ManyToMany
	private Set<EmployeeManyToMany> employee;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private String project_id;

	@Column(name = "project_name")
	private String project_name;


	public Projects()
	{

	}


	public Projects(String project_name) {
		super();
		this.project_name = project_name;
	}



	@SuppressWarnings("rawtypes")
	public Set getEmployee() {
		return employee;
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setEmployee(Set employee) {
		this.employee = employee;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


}
