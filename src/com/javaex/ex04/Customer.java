package com.javaex.ex04;

public class Customer extends User{
	
	//필드
	private int point;

	
	//생성자
	public Customer() {
		
	}
	
	public Customer(int point) {
		super();
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	//메소드 g/s
	public void setPoint(int point) {
		this.point = point;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Customer [point=" + point + ", getId()=" + getId() + ", getPassword()=" + getPassword() + ", getName()="
				+ getName() + ", toString()=" + super.toString() + "]";
	}
	
	
	public void showInfo() {
		System.out.println("아이디:"+"패스워드:"+"이름:"+"포인트:");
	}
	
	

	

}
