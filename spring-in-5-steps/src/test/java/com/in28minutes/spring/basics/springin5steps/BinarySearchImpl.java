package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int numbertosearchfor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm); // to show what algorithm is being used 
		return 3;
	}

}
