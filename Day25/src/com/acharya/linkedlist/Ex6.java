package com.acharya.linkedlist;


import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("Danu");
		l1.add(9);
		l1.add("praju");
		l1.add(6);
		System.out.println("Initial List: "+l1);
		System.out.println(l1.pollLast());
		System.out.println("The Linked List: "+l1);

	}

}