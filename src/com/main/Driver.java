package com.main;

import com.first.SuperDepartment;
import com.fourth.TechDepartment;
import com.second.AdminDepartment;
import com.third.HrDepartment;

public class Driver {      // creating main class
	
	//initializing object 
	
	
	String  adminObj;
	String  hrObj;
	String  techObj;
	
	public static void main(String[] args) {     //  Main Method
		
		
		SuperDepartment adminObj = new AdminDepartment();   //  creating  adminObj
		
		System.out.println(adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
		System.out.println();
		
		SuperDepartment hrObj = new HrDepartment();          //  creating  HrObj
		
		
		System.out.println(hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
		System.out.println();
		
		SuperDepartment techObj = new TechDepartment();       //  creating  techObj
		
		
		System.out.println(techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
		System.out.println();
		
	}

}
