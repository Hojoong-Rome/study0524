package com.mycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				int answer = i * j;
				System.out.println(i + "*" + j + "=" + answer);
			}
			System.out.println("---------");
		}
	}

}
