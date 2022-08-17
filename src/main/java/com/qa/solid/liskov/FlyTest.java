package com.qa.solid.liskov;

public class FlyTest {

	public void learnToFly(Bird bird) throws Exception { 
		
		// Not all birds can fly
		// So they're checking the type of bird BEFORE calling fly()
		if (bird instanceof Owl) {
			bird.fly();
		}
			
	}
}
