package com.atmecs.hb.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeDetails")

public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_details_id")
	private int employee_details_id;

	@Column(name = "designation")
	private String designation;

	@Column(name = "department")
	private String department;
	
	@Column(name = "salary")
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private EmployeeOneToOne employeeOneToOne ;
	

	
	
	
	public EmployeeDetails() {
	}

	public EmployeeDetails(String designation, String department, int salary) {
		super();
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeOneToOne getEmployeeOneToOne() {
		return employeeOneToOne;
	}

	public void setEmployeeOneToOne(EmployeeOneToOne employeeOneToOne) {
		this.employeeOneToOne = employeeOneToOne;
	}

	

	
	
	}

	


