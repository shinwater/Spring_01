package com.sist.di12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main_spring {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:process.xml");
		
		MyProcess process = (MyProcess)ctx.getBean("process");
		process.print();
		ctx.close();
	}
}
