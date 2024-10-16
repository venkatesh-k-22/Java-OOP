package com.java.methodOverloading;

public class Printer {
	
	//multiple methods with the same name(print) within a class(Printer) is called method overloading
	//this is called method overloading(Virtual Polymorphism)(1:Many relations)
	//but actually many functions are doing many things like (1:1 relationship)
	//many print functions are there if you call print function with parameter it will call that particular print function 

	void print(int a) {
		System.out.println(a);
	}
	
	void print(float a) {
		System.out.println(a);
	}
	
	void print(char a) {
		System.out.println(a);
	}
	
	void print(boolean a) {
		System.out.println(a);
	}
	
	void print(String a) {
		System.out.println(a);
	}
	
	void print(int a, int b) {
		System.out.println(a+" "+b);
	}
	
	void print(int a, float b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		p.print(3);
		p.print('c');
	}

}
