package com.acharya.linkedlist;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
	  LinkedList<String> l1= new LinkedList<>(); 	
		l1.add("Praju");
		l1.add("Danu");
		l1.add("Visu");
		l1.add("Anil");
		l1.add("Babu");
		Iterator i = l1.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}