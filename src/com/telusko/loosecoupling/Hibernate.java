package com.telusko.loosecoupling;

public class Hibernate implements Course {

	@Override
	public boolean PurchaseCourse(double amount) {
		System.out.println("Registered for the Hibernate course "+amount);
		return true;
	}

}
