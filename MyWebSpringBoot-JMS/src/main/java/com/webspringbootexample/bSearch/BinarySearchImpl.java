package com.webspringbootexample.bSearch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webspringbootexample.sort.Sort;
//@Component
public class BinarySearchImpl {
	/*@Autowired
    Sort sortingImpl=null;*/

	Sort sortingImpl=null;
	public BinarySearchImpl(Sort sortingImpl) {
		super();
		this.sortingImpl = sortingImpl;
	}


	public boolean isPresent(int[] sourceNumbers, int numberToBeSearched) {
		System.out.println(" in binary search");
		sortingImpl.sort(sourceNumbers);
		System.out.println("doing search of "+numberToBeSearched);
		/**
		 * logic to search
		 */
		boolean res=false;
		for(int i:sourceNumbers) {
			if(i == numberToBeSearched) {
				res = true;
			    break;
			}
		}
		return res;
	}
	
	

}
