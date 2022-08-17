package com.qa.solid.liskov.birdsolution;

public class Runner {

	public static void main(String[] args) {
		
		Owl owl = new Owl();
		Penguin penguin = new Penguin();
		
		FlyTest ft = new FlyTest();
		
		ft.learnToFly(owl);
		
		ft.tryToFly(penguin);

	}

}
