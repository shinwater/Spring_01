package com.sist.di02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * DI 즉 주입을 어떻게 할 것인지는 xml 문서에 기입이 되어 있음. 스프링 컨테이너인 ctx가 "classpath:examl.xml"을
		 * 보고 DI를 실행. exam.xml 파일은 resources 폴더에 들어가 있어야 한다.
		 */

		/*
		 DI 작업을 해주는 스프링 컨테이너
		 스프링 컨테이너 객체를 생성한다. -스프링컨테이너안에 빈들을 생성ㅇ한다
		 xml 파일을 이용하여 스프링 컨테이너 객체가 생성이 된다.(메모리로 로딩이 된다.)
		 */
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:exam.xml");
		/*
		실제적으로 주입 과정이 진행됨
		new 키워드를 사용하지 않고 직접 스프링 컨테이너에서 꺼내서 사용함.
		*/
		ExamDAO dao = ctx.getBean("daoImpl", ExamDAOImpl.class);
		dao.printMsg();
		
		ctx.close();
		
		
		
		
		
	}

}
