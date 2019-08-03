package com.webspringbootexample.bSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webspringbootexample.entity.SearchSet;
import com.webspringbootexample.repository.SearchSetRepository;

@Service
public class SpringSearchApp {
	@Autowired
	BinarySearchImpl bubbleSortSearchImpl =null;
	@Autowired
	BinarySearchImpl quickSortSearchImpl =null;
	@Autowired
	SearchSetRepository sSr=null;
/*
	public void setBubbleSortSearchImpl(BinarySearchImpl bubbleSortSearchImpl) {
		this.bubbleSortSearchImpl = bubbleSortSearchImpl;
	}

	public void setQuickSortSearchImpl(BinarySearchImpl quickSortSearchImpl) {
		this.quickSortSearchImpl = quickSortSearchImpl;
	}*/


public  boolean search(int noTobeSearched) {
	int [] searchNumbers={1,5,4,7,8};
	//performBubbleSortBasedSearch(searchNumbers);
	return performQuickSortBasedSearch(searchNumbers,noTobeSearched);
}

public  boolean search(String sortAlgotTobeUsed,int noTobeSearched) {
	int [] searchNumbers={1,5,4,7,8};
	if("bubble".equals(sortAlgotTobeUsed))
	     return performBubbleSortBasedSearch(searchNumbers,noTobeSearched);
	else if ("quick".equals(sortAlgotTobeUsed))
	     return performQuickSortBasedSearch(searchNumbers,noTobeSearched);
	return true;
}

private  boolean performQuickSortBasedSearch(int [] searchNumbers,int noToBeSearched) {
	System.out.println("Completig search the serach with quick ");
	return quickSortSearchImpl.isPresent(searchNumbers, noToBeSearched);
}



private  boolean performBubbleSortBasedSearch(int [] searchNumbers,int noToBeSearched) {
	System.out.println("Completig search the serach with bubble ");
	return bubbleSortSearchImpl.isPresent(searchNumbers, noToBeSearched);
}

public SearchSet addSearchSet(SearchSet searchSet) {
	// TODO Auto-generated method stub
	return sSr.save(searchSet);
}



}
