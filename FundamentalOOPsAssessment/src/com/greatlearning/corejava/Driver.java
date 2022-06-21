package com.greatlearning.corejava;

public class Driver {
	public static void main(String args[]) {
		
		// object of AdminDepartment class
		AdminDepartment admin = new AdminDepartment();
		
		// object of HrDepartment class
		HrDepartment hr = new HrDepartment();
		
		// object of TechDepartment class
		TechDepartment tech = new TechDepartment();
		
		
		// calling functionality of AdminDepartment
		System.out.println("Welcome to " + admin.departmentName());;
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		// calling functionality of HRDepartment
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		// calling functionality of TechDepartment
		System.out.println("Welcome to " + tech.departmentName());;
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInfo());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();

	}
}
