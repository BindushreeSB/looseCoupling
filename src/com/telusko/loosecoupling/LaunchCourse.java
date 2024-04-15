package com.telusko.loosecoupling;

public class LaunchCourse {
	
	private Course course;
	
 public void setCourse(Course course)
	{
		this.course = course;
	}
 
 boolean BuyCourse(double amount)
 {
	 course.PurchaseCourse(amount);
	 return true;
 }

}
