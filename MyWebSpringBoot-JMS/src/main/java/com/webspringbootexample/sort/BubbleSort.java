package com.webspringbootexample.sort;


import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements Sort {
	
	public  int[] sort(int[] sourceNumbers) {
		System.out.println(" doing bubble sort");
		return sourceNumbers;
	}
}
