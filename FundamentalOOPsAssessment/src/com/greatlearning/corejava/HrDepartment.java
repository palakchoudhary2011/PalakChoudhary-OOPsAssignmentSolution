package com.greatlearning.corejava;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Human Resource Department.";
	}
	
	public String getTodaysWork() {
		return "Fill todays worksheet and mark todays attendance.";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team lunch";
	}
}
