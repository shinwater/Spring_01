package com.sist.di01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		MyGetSum getSum = new MyGetSum();
		getSum.setGetSum(new GetSum());
		getSum.setA(200);
		getSum.setB(100);
		
		getSum.getGetSum().sum(getSum.getA(), getSum.getB());
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		// getsum.xml에 있는 bean들을 주입받음
		MyGetSum getsum =  (MyGetSum) ctx.getBean("mySum");
		// getsum.xml에 있는 bean의 id를 가져온다 
		
		getsum.sum();
		
		ctx.close();
		// 컨테이너는 반드시 닫아주어야 한다.
		
	}

}
