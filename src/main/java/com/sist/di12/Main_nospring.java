package com.sist.di12;

public class Main_nospring {
	
	public static void main(String[] args) {
	
		//MyProcess 객체 생성
		//-기본생성자로 객체 생성
		MyProcess my = new MyProcess();
		my.setName("홍길동");
		my.setAge(27);
		
		my.print();
		
		System.out.println("=================");
		
		//-인자 생성자를 이용하여 객체 생성
		MyProcess my2 = new MyProcess("유관순",19);
		my2.print();
	}
	
}
