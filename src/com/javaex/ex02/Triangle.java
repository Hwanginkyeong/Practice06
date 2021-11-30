package com.javaex.ex02;

public class Triangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}
	
	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}

	public Triangle(String fillColor,String lineColor,int width, int height) {
		super();
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}

	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}
	
	public void showInfo() {
		System.out.println("가로: "+width+"세로: "+ height+"면색: "+super.getFillColor()+" 선색: "+super.getLineColor());
	}
	
	
	
	
	
	
	
	
	
	
	
}


