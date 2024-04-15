package com.telusko.loosecoupling;

public class SpringBoot implements Course{

	@Override
	public boolean PurchaseCourse(double amount) {
		System.out.println("Registered for the SpringBoot course "+amount);
		return true;
	}

}
