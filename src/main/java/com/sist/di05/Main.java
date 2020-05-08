package com.sist.di05;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:person.xml");
		
		PersonInfo info=ctx.getBean("Info",PersonInfo.class);
		info.getPersonInfo();                                                                                                                                                                                                                                                     
		ctx.close();
		
	}

}
