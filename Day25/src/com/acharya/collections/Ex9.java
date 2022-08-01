package com.acharya.collections;

import java.util.*;

public class Ex9 {

	public static void main(String[] args) {
		List <Integer> l= new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		List <Integer> l1= new ArrayList<>();
		l1.add(300);
		l1.add(400);
		l1.add(500);
		System.out.println(l);
		l.removeAll(l1);
		System.out.println(l1);
		System.out.println(l);
		
	}

}
