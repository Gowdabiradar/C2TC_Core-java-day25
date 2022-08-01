package com.acharya.collections;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		List <Integer> li= new ArrayList<>();
		li.add(34);
		li.add(87);
		li.add(8);
		Iterator z=li.iterator();
	    
		while(z.hasNext())
		{
			System.out.print(z.next());
			System.out.println("Array List:"+li);
		}
	}

}