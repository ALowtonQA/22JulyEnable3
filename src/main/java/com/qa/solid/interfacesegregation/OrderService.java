package com.qa.solid.interfacesegregation;

public interface OrderService {

	void orderBurger(int quantity);
	
	void orderFries(int quantity);
	
	void orderMeal(int numOfBurgers, int numOfFries);
	
}
