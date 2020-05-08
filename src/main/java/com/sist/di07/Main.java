package com.sist.di07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  스프링은 객체를 생성하고 각 객체를 연결해주는 조립기 역할을 한다.
		 *  여기에 있는  GenericXmlApplicationContext가 조립기 기능을 구현한 클래스임.
		 *  조립기에서 생성할 객체가 무엇이고, 각 객체를 어떻게 연결하는지에 대한 정보는 
		 *  xml  파일에 설정이 되어있음.
		 *   GenericXmlApplicationContext 클래스는 이 xml 파일에 정의된 설정 정보를 읽어 와서 
		 *   객체를 생성하고 각각의 객체를 연결한 뒤에 내부적으로 보관을 함.
		 *   xml을 이용한 스프링 설정을 하다 보면 컨테이너가 생성할 객체를 지정하기 위해 
		 *   <bean> 태그를 이용하는 것을 볼 수 있음.
		 *   스프링 컨테이너가 생성해서 보관하는 객체를 스프링 빈(Spring bean) 객체라고 부르며,
		 *   일반적으로 자바 객체와 동일함.
		 *   스프링 컨테이너는 생성한 빈 객체를 <이름,빈 객체> 이렇게 쌍으로 보관을 함.
		 *   스프링 컨테이너가 보관하고 있는 객체를 사용하고 싶은 경우 빈 객체와 연결되어 있는 이름을 
		 *   이용해서 객체를 참조하게 됨. 
		 */
		
		/*
		 * 스프링 컨테이너의 종류
		 * BeanFactory : 단순히 스프링 컨테이너에서 객체를 생성하고  DI만 처리해주는 기능만을 제공하는 객체.
		 * 	하지만 스프링을 사용하는 이유는 단순히 DI만 사용하기 위함이 아님.
		 * 	스프링이 사용하는 다양한 부가기능(트랜잭션 처리, 자바코드 기반의 스프링설정, 애노테이션을 이용한 
		 * 	빈 설정, 스프링을 이용한 웹 개발 등등) 때문인데 이러한 부가 기능을 사용하려면 ApplicationContext 
		 * 	객체를 주로 사용하게 됨.
		 * 	
		 * 	-  AbstractApplicationContext : 컨테이너 종료(close)와 같은 기능을 제공해 주는 객체 
		 * 	-  GenericXmlApplicationContext : AbstractApplicationContext 객체를 상속 받아서 만들어진
		 * 			클래스로서 xml 파일에서 스프링 빈 설정 정보를 읽어오는 역할을 함.
		 * 
		 * 	GenericXmlApplicationContext 객체를 전달받은 xml 파일에서 설정 정보를 읽어와서 스프링 빈 객체를
		 *  생성하고 프로퍼티 값을 설정해 줌.
		 *  이렇게 생성된 스프링 빈 객체는 getBean() 이라는 메서드를 사용해서 구할 수 있음.
		 *  getBean() 메서드에서 첫번째 파라미터는 구하고자 하는 스프링 빈 객체의 고유한 id이름이며,
		 *   두번째 파라미터는 그 객체의 타입임.
		 */
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:baseball.xml","classpath:baseball2.xml");
		
		PlayerInfo info = ctx.getBean("playerInfo",PlayerInfo.class);
		Player player2 = info.getPlayer();
		System.out.println("선수이름 : "+player2.getName());
		System.out.println("선수나이 : "+player2.getAge());
		System.out.println("선수포지션 : "+player2.getPosition());
		System.out.println("선수키 : "+player2.getHeight());
		System.out.println("선수몸무게 : "+player2.getWeight());
		System.out.println("===============================");

		Player player1 = ctx.getBean("player1",Player.class);
		System.out.println("선수이름 : "+player1.getName());
		System.out.println("선수나이 : "+player1.getAge());
		System.out.println("선수포지션 : "+player1.getPosition());
		System.out.println("선수키 : "+player1.getHeight());
		System.out.println("선수몸무게 : "+player1.getWeight());
		System.out.println("===============================");
		
		Player player3 = ctx.getBean("player3", Player.class);
		System.out.println("선수이름 : "+player3.getName());
		System.out.println("선수나이 : "+player3.getAge());
		System.out.println("선수포지션 : "+player3.getPosition());
		System.out.println("선수키 : "+player3.getHeight());
		System.out.println("선수몸무게 : "+player3.getWeight());
		System.out.println("===============================");
		
		
		BaseBallTeam team =ctx.getBean("team", BaseBallTeam.class);
		System.out.println(":::국가대표 야구팀 명단:::");
		System.out.println("야구팀 감독: " +team.getManager());
		System.out.println("야구팀 타격코치: " +team.getBattingCoach());
		System.out.println("야구팀 투수코치: " +team.getPitcherCoach());
		System.out.println("야구팀 타자: " +team.getHitter());
		System.out.println("야구팀 투수: " +team.getPitcher());
		
		ctx.close();
	}

}
