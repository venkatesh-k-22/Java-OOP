package com.arraylist.builtinmethods;

import java.util.ArrayList;

public class DeletingElements {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10, 20, 30, 40, 50]
		//removing the element using it's index
		al.remove(2);// 30 got removed from the list
		System.out.println(al);//[10, 20, 40, 50]
		//remove the value from the list without knowing the index
		al.remove(new Integer(50)); // if you just remove the primitive 50 it jvm thinks it is index so it throws exception
		al.remove(new Integer(100));//it will not give any error or exception it will give false
		System.out.println(al);//[10, 20, 40]
//		
//		//remove another list's value from original list
		ArrayList b = new ArrayList();
		b.add(20);
		b.add(40);
		System.out.println(b);//[20,40]
		al.removeAll(b);
		System.out.println(al);//[10]
		

	}

}
