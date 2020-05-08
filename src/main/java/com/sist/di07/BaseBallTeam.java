package com.sist.di07;

import lombok.Data;

@Data
public class BaseBallTeam {

	private String manager;
	private String battingCoach;
	private String pitcherCoach;
	private String hitter;
	private String pitcher;
	
	public BaseBallTeam() {}//기본생성자
	
	public BaseBallTeam(String manager, String battingCoach, String pitcherCoach) {
		this.manager = manager;
		this.battingCoach = battingCoach;
		this.pitcherCoach = pitcherCoach;
	}//인자생성자
	
}
