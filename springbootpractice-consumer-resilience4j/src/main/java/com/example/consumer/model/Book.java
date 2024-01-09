package com.example.consumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Book {
	String id;
	
	String name;
	
	@JsonProperty("year")
	Integer publishYear;
	String author;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String id, String name, Integer publishYear, String author) {
		this.id = id;
		this.name = name;
		this.publishYear = publishYear;
		this.author = author;
	}
	public Book() {
		
	}
	
	
	//Mapstruct - to copy data from one class to another.
	
	

}
