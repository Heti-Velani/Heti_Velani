package com.tns.isarelation;

public class Employee {
	
	private String name;
	private int emp_id;
	private String department;
	
	public Employee() {
		super();
	}

	public Employee(String name, int emp_id, String department) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp_id=" + emp_id + ", department=" + department + "]";
	}
	
	
}
