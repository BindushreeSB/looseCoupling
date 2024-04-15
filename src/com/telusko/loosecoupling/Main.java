package com.telusko.loosecoupling;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Telusko App");
		LaunchCourse course = new LaunchCourse();
		course.setCourse(new Hibernate());
		boolean status = course.BuyCourse(5000.00);
		
		
		if(status)
		{
			System.out.println("Course purchased successfully :)");
		}
		else
		{
			System.out.println("Failed to purchase course :(");
		}
		
		
	}

}
