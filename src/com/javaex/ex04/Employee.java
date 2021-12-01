package com.javaex.ex04;

public class Employee extends User{
	
	
	//필드
	protected int salary;

	
	//생성자
	public Employee() {
		
	}
	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	
	//메소드 g/s
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", getId()=" + getId() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + ", toString()=" + super.toString() + "]";
	}

	public void showInfo() {
		System.out.println("아이디: "+super.id+" 패스워드: "+super.password+" 이름: "+super.name+" 급여: "+this.salary);
	}
	
	
	
	

	
	

	
}
