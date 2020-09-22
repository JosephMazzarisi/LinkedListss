package com.company;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("");
		LinkedList myList = new LinkedList();

		for (int y = 0; y < 6; y++)
			myList.add(y);
		System.out.println("GetFirst Test " + myList.getFirst());
		System.out.println("GetLast Test " + myList.getLast());
		System.out.println("IndexOf Test " + myList.indexOf(5));
		System.out.println("Get Test " + myList.get(5));
		System.out.println("Get Size Test " +  myList.size());
		myList.add(1,5);
		myList.addLast(5);
		myList.addFirst(6);
		System.out.println("List Should Equal [6,0,5,1,2,3,4,5,5] " + myList);
		System.out.println("Contains Test " + myList.contains(0));
		myList.set(1,4);
		System.out.println("Set Test " + myList);
		System.out.println(myList.poll());
		System.out.println(myList);
		System.out.println("LastIndex Test " + myList.lastIndexOf(8));
		myList.remove(7);
		System.out.println("Remove Test" + myList);
		System.out.println("Poll Last Return Test " + myList.pollLast());
		System.out.println("Should return [4,5,1,2,3,4] " + myList);
		System.out.println(myList.remove(4));
		System.out.println(myList);
		myList.clear();
		System.out.println("Clear Test" + myList);

	}
}
