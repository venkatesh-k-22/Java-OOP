package com.java.methodOverloading;

public class RealTimeExample {

	//Real time zomato app example while changing the user details
	char gender;
	String city;
	int cID;
	long mobile;
	
	//here we are created seperate method for updating the details of users
	//if lakhs of lakhs of people data has to be update then each time we have to call this methods
//	void setGender(char c) {
//		gender = c;
//	}
//	
//	void setCity(String s) {
//		city = s;
//	}
//	
//	void setCID(int n) {
//		cID = n;
//	}
//	
//	void setMobile(long m) {
//		mobile = m;
//	}
	
	//Instead of calling different methods we can call via single method name to update the detailes
	
	void setDetails(char c) {
		gender = c;
	}
	
	void setDetails(String s) {
		city = s;
	}
	
	void setDetails(int i) {
		cID = i;
	}
	
	void setDetails(long l) {
		mobile = l;
	}
	
	
	
	public static void main(String[] args) {
		RealTimeExample ret = new RealTimeExample();
		ret.gender = 'M';
		ret.city = "Banaglore";
		ret.cID = 1233;
		ret.mobile = 8973342;
		
		System.out.println(ret.gender);
		System.out.println(ret.city);
		System.out.println(ret.cID);
		System.out.println(ret.mobile);
		
		//calling the methods for updation
//		ret.setGender('F');
//		ret.setCity("Hyderabad");
//		ret.setCID(783);
//		ret.setMobile(86534222);
		
		
		//calling the overloaded method for updation
		ret.setDetails('F');
		ret.setDetails("Hyderabad");
		ret.setDetails(98);
		ret.setDetails(897847786);
		
		System.out.println(ret.gender);
		System.out.println(ret.city);
		System.out.println(ret.cID);
		System.out.println(ret.mobile);
		
		

	}

}
