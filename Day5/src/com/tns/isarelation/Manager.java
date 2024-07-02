package com.tns.isarelation;

public class Manager extends Employee {
	
	private int teamsize;
	
	public Manager(){
		super();
	}

	public Manager(String name, int emp_id, String department,int teamsize) {
		super(name,emp_id,department);
		this.teamsize = teamsize;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	@Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", getName()=" + getName() + ", getEmp_id()=" + getEmp_id()
				+ ", getDepartment()=" + getDepartment() + "]";
	}
}
