package com.cognixia.jump.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamdriver {

	public static void main(String[] args) {
		int[]	prim = {2,6,5,3};
		Integer[] integers =new Integer[prim.length];
		for(int i=0;i< prim.length;i++) {
			integers[i]=(Integer) prim[i];
		}
		
		Integer[] intObjs = Arrays.stream(prim).boxed().toArray(Integer[]::new);
		
		
		List<Integer> numbers = Arrays.asList(intObjs);
		
		
		//numbers.forEach(System.out::println);
		//System.out.println(numbers.stream().reduce(0, (num1,num2)->num1 +num2));
		
		int max= numbers.stream().reduce((num1,num2)->num1>num2 ? num1 : num2).get();
		
		//System.out.println(max);
		
		List<Employee> employees =new ArrayList<>();
		
		employees.add(new Employee("Patterson", 110_000, "Production"));
		employees.add(new Employee("Mandeep", 200_000, "Director"));
		employees.add(new Employee("Sean", 150_000, "Writing"));
		employees.add(new Employee("Matthew", 100_000, "IT"));
		employees.add(new Employee("DJ", Integer.MAX_VALUE, "DJ"));
		
		Employee lowest= employees.stream()
				.reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2)
				.get();
		List<Integer> emploteesAfterRaise= employees.stream()
				.map(e-> e.getSalary()+10000).collect(null);
		
		System.out.println(Integer.MAX_VALUE+10000);
		
	}

	
	
}

