package com.arraylist.builtinmethods;

import java.util.ArrayList;

public class Insertions {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al); //[10, 20, 30, 40, 50]
		//Insert the value at the particular Index
		al.add(2,99);
		System.out.println(al);//[10, 20, 99, 30, 40, 50] 99 added at index 2
		//Insert Another arraylist 
		ArrayList b = new ArrayList<>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		System.out.println(b);//[100, 200, 300, 400]
		al.addAll(b);
		System.out.println(al); //[10, 20, 99, 30, 40, 50, 100, 200, 300, 400]
		
		//Insert the second array at anywhere from the list
		al.addAll(3,b);
		System.out.println(al); //[10, 20, 99, 100, 200, 300, 400, 30, 40, 50, 100, 200, 300, 400]
		
		
		

	}

}
