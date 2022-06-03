package com.tns.association;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name="Dept_Master")
public class Department  {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME1")
	private String name12;
	//One department has many employees 
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private Set<Employee32>employees = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name12;
	}
	public void setName(String name) {
		this.name12 = name;
	}
	public Set<Employee32> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee32> employees) {
		this.employees = employees;
	}
	public void addEmployee(Employee32 employee) {
		employee.setDepartment(this);
		this.getEmployees().add(employee);
	}
		
	}
	




