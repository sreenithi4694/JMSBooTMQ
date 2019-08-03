package com.webspringbootexample.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchSet {
    @Override
	public String toString() {
		return "SearchSet [id=" + id + ", name=" + name + ", valueOFSet=" + valueOFSet + "]";
	}
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    //@Column
	private String name;
    //@Column
	private String valueOFSet;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValueOFSet() {
		return valueOFSet;
	}
	public void setValueOFSet(String valueOFSet) {
		this.valueOFSet = valueOFSet;
	}

}
