package com.qa.solid.liskov;

public class Runner {

	public static void main(String[] args) {
		
		Owl owl = new Owl();
		Penguin penguin = new Penguin();
		
		FlyTest ft = new FlyTest();
		
		try {
			ft.learnToFly(owl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
