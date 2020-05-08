package com.sist.di05;

import lombok.Data;

@Data
public class PersonInfo {
	private Person person;
	
	public PersonInfo() { };//기본생성자
	public PersonInfo(Person person) {
		this.person = person;
	};//ㅇㅈ생성자
	
	public void getPersonInfo() {
		if(person != null) {
			System.out.println("이름 ==>" +person.getName());
			System.out.println("성별 ==>" +person.getGender());
			System.out.println("나이 ==>" +person.getAge());
			System.out.println("주민번ㅂ호 ==>" +person.getJuminNo());
		}
	}
}
