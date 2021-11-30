package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	protected int cNo;
	protected int point;
	
	
	
	//생성자
	public Customer() {
		
	}
	
	public Customer(String name, String hp,int cNo, int point) {
		super();
		super.name = name;
		super.hp = hp;
		this.cNo = cNo;
		this.point = point;
	}

	
	//메소드 g/s
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", name=" + name + ", hp=" + hp + "]";
	}
	
	public void showInfo() {
		System.out.println("#이름: "+super.name+", #핸드폰: "+super.hp+", #고객번호: "+this.cNo+", #포인트점수: "+this.point);
	}
	
	
	
	
	
	
	
	
}
