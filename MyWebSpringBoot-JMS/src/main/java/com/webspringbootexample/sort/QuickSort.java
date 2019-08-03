package com.webspringbootexample.sort;


import org.springframework.stereotype.Component;

@Component
public class QuickSort implements Sort {

	public  int[] sort(int[] sourceNumbers) {
		 System.out.println(" doing quick sort");
		return sourceNumbers;
	}
}
