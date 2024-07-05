package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

	@Entity
	@Table(name="regemployee114")
	@PrimaryKeyJoinColumn(name="id")
	
	public class RegEmployee extends Employee{
		
		float salary;
		String dept;
		
		public RegEmployee(float salary, String dept, String name) {
			super(name);
			this.salary = salary;
			this.dept = dept;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept =dept;
		}
		
		
		}




