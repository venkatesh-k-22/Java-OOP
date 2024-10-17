package com.arraylist;

import java.util.ArrayList;

public class Test {
	
	//Advantages to overcome Arrays
	//ArrayList can store heterogeneous data
	//ArrayList can grow and shrink in size (size is not fixed like arrays)
	//there are multiple in built methods are there in ArrayList to manipulate the data

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("ROHIT");
		al.add(true);
		al.add(99.9f);
		System.out.println(al);
	}

}
