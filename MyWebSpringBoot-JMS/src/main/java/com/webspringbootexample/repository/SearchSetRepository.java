package com.webspringbootexample.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.webspringbootexample.entity.SearchSet;

public interface SearchSetRepository extends CrudRepository<SearchSet, Long>{

}
