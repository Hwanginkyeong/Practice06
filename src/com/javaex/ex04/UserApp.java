package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] uArray = new User[3];
		
		User c01 = new Customer("jws","j1234","정우성",1000);
		User c02 = new Customer("yjs","y2345","이효리",2000);
		User e02 = new Employee("마스터","m7788","운영자",5000000);
		
		uArray[0] = c01;
		uArray[1] = c02;
		uArray[2] = e02;
		
		for(int i=0; i<uArray.length; i++) {
			System.out.println(uArray[i]);
		}
		
		System.out.println();
		
				
				
		
		
		
		
		

	}

}
