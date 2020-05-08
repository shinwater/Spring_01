package com.sist.di03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:mydao.xml");
		
		ServiceImpl service =  ctx.getBean("service", ServiceImpl.class); //주입받을객체아이디,반환받을 타입
		
		service.biz();
		ctx.close();
	}

}
