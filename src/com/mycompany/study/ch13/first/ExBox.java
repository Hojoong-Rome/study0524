package com.mycompany.study.ch13.first;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		box.setT("장원영");
		System.out.println(box.getT());
		
		Box<Integer> box2 = new Box<>();
		box2.setT(1);
		System.out.println(box2.getT());

		Box<Object> box3 = new Box<>();	
		
	}

}
