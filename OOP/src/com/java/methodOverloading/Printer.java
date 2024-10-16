package com.java.methodOverloading;

public class Printer {

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
