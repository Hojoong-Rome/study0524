package com.mycompany.study.ch03;

public class ExLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리 연산자
		// && = &: and: 논리곱 :연산 참 참/참, 나머지 false
		// || = |: or: 논라합: 연산 참 폴스/참, 폴스 참/참, 참 참/참, 폴스 폴스/폴스
		// ^: 배타적 논리합: 연산 참 참/폴스, 폴스 폴스/폴스, 참 폴스/참, 폴스 참/참
		
		int a = 65;
		
		if(a >= 65 && a <= 70) {
			System.out.println("&&: true");
		}
		
		if(a > 65 || a <= 70) {
			System.out.println("||: true");
		}
		
		if(a > 65 ^ a <= 70) {
			System.out.println("^: true");
		}
	}

}
