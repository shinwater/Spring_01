package com.sist.di04;

import lombok.Data;

@Data
public class Exam {
	
	private String msg;
	
	public Exam() { }//기본생성자
	public Exam(String msg) { 
		this.msg = msg;
	}//ㅇㅈ생성자
	
	public void output() {
		System.out.println("메세지==>" +msg);
	}
	
}
