package com.sist.di01;

public class MyGetSum {

	private int a;
	private int b;
	GetSum getSum;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public GetSum getGetSum() {
		return getSum;
	}

	public void setGetSum(GetSum getSum) {
		this.getSum = getSum;
	}
	
	public void sum() {
		getSum.sum(a, b);
	}
}
