package com.sist.di12;

import lombok.Data;

@Data
public class MyProcess {

	private String name;
	private int age;
	
	public MyProcess() { } //기본생성자
	
	public MyProcess(String name, int age) {
		this.name = name;
		this.age = age;
	} //인자생성자
	
	public void print() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
	}
}
