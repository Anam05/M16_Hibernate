package com.tns.association;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMP_MASTER")
public class Employee32 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="SALARY")
	private double salary;
	
	@ManyToOne
	@JoinColumn(name="dept_no")
	private Department department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}