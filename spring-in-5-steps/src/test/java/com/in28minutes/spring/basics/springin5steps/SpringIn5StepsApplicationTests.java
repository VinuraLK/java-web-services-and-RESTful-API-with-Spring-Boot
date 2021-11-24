package com.in28minutes.spring.basics.springin5steps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringIn5StepsApplicationTests {
	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {12,4,3}, 3);
		System.out.println(result);
		
	}

	
}
