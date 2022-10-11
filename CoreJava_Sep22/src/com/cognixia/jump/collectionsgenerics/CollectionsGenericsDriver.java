package com.cognixia.jump.collectionsgenerics;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CollectionsGenericsDriver {

	public static void main(String[] args) {
		
		// Showcasing Generics Method and VarArgs from Calculator
//		System.out.println(Calculator.sum(5, 2));
//		System.out.println(Calculator.sum(5.5, 2.7));
//		System.out.println(Calculator.sum(5, 2.7));
//		System.out.println(Calculator.sum(5, 2.7f, 6l, 9.9d));
		
		// For all collections,
			//CRUD
			// Create Data
			// Read Data
			// Update Data
			// Delete Data
			// *looping through the collection
		
		// List
		List<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("blue");
		System.out.println(colors);
		colors.add(0, "yellow");
		System.out.println(colors);
		
		// Set
		
		// Queue
			// Polymorphism with Interfaces
		List<String> listColors= new LinkedList<>(colors);
		Deque<String> qColors= new LinkedList<>(colors);
		
		System.out.println(listColors.get(0));
		System.out.println(qColors);
		System.out.println(qColors.peek());
		qColors.add("Purple");
		System.out.println(qColors);
		// Map
		Map<String,Double> coins= new HashMap<>();
		coins.put("Quarter", 0.25);
		coins.put("Dime", 0.10);
		coins.put("Nickel", 0.05);
		coins.put("Penny", 0.01);
		
		System.out.println(coins);
		
		
		
		
	}

}
