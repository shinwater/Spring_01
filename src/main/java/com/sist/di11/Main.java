package com.sist.di11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class); 
		//객체를 생성할클래스이름을 넣어줌
		
		Player player1 = ctx.getBean("player1",Player.class);//메서드이름을 넣어준다 (메서드이름은 중복이되면안됨)
		System.out.println("선수 이름 : " + player1.getName());
		System.out.println("선수 나이 : " + player1.getAge());
		System.out.println("선수 포지션 : " + player1.getPosition());
		System.out.println("선수 신장 : " + player1.getHeight());
		System.out.println("선수 체중 : " + player1.getWeight());
		System.out.println("===================================================");
		
		
		Player player2 = ctx.getBean("player2",Player.class);//메서드이름을 넣어준다 (메서드이름은 중복이되면안됨)
		System.out.println("선수 이름 : " + player2.getName());
		System.out.println("선수 나이 : " + player2.getAge());
		System.out.println("선수 포지션 : " + player2.getPosition());
		System.out.println("선수 신장 : " + player2.getHeight());
		System.out.println("선수 체중 : " + player2.getWeight());
		System.out.println("===================================================");
		
		Player player3 = ctx.getBean("player3",Player.class);//메서드이름을 넣어준다 (메서드이름은 중복이되면안됨)
		System.out.println("선수 이름 : " + player3.getName());
		System.out.println("선수 나이 : " + player3.getAge());
		System.out.println("선수 포지션 : " + player3.getPosition());
		System.out.println("선수 신장 : " + player3.getHeight());
		System.out.println("선수 체중 : " + player3.getWeight());
		System.out.println("===================================================");
		ctx.close(); 

		
		
	}

}
