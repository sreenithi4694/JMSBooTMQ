package com.webspringbootexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webspringbootexample.bSearch.SpringSearchApp;
import com.webspringbootexample.entity.SearchSet;

@RestController
public class SearchController {

	@Autowired
	public SpringSearchApp searchService;
	@GetMapping("/search/{noToBeSearched}")
	public boolean search(@PathVariable("noToBeSearched") int noToBeSearched) {
		return searchService.search(noToBeSearched);
	}
	
	@GetMapping("/search/{sortAlgoToBeUsed}/{noToBeSearched}")
	public boolean search(@PathVariable("sortAlgoToBeUsed") String sortAlgoToBeUsed,@PathVariable("noToBeSearched") int noToBeSearched) {
		return searchService.search(sortAlgoToBeUsed,noToBeSearched);
	}
	
	@PostMapping("/search")
	public SearchSet addSearchSet(@RequestBody SearchSet searchSet) {
		return searchService.addSearchSet(searchSet);
	}
}
