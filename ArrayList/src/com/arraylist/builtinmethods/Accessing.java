package com.arraylist.builtinmethods;

import java.util.ArrayList;

public class Accessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al); //[10, 20, 30, 40, 50]
		
		//get the value based on index
		System.out.println(al.get(2));// 30
		
		//get the subList range from ArrayList 
		//if the index value is out of range then it will throw IndexOutOfBounds Exception
		System.out.println(al.subList(2, 4));//[30, 40]

		//get the index using values
		System.out.println(al.indexOf(40)); //3
		
		//get the index of duplicate element at last
		al.add(30);
		al.add(60);
		System.out.println(al);//[10, 20, 30, 40, 50, 30, 60]
		System.out.println(al.lastIndexOf(30));//5
	}

}
