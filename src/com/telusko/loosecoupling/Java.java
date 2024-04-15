package com.telusko.loosecoupling;

public class Java implements Course {

	@Override
	public boolean PurchaseCourse(double amount) {
		System.out.println("Registered for the Java course "+amount);
		return true;
	}

}
