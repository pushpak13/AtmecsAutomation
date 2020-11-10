package com.atmecs.hb.entity;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "employee")
public class EmployeeManyToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employee_id;

	@Column(name = "full_Name")
	private String fullName;

	@Column(name = "email")
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="employee_project",
               joinColumns = @JoinColumn(name = "employee_id"),
               inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Projects> projects;
	
	public EmployeeManyToMany()
	{
	}

	public EmployeeManyToMany(String fullName, String email) {
		super();
		this.fullName = fullName;
		this.email = email;
	}

	public String getfullName() {
		return fullName;
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@SuppressWarnings("rawtypes")
	public Set getProjects() {
		return projects;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setProjects(Set projects) {
		this.projects = projects;
	}

	

}
