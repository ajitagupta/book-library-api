package com.example.consumer.model;

import java.util.List;

public class Library {

	String id;
	
	String name;
	String address;
	Integer numBooks;
	
	
	//unidirectional relationship one to many
	List<Book> books;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumBooks() {
		return numBooks;
	}

	public void setNumBooks(Integer numBooks) {
		this.numBooks = numBooks;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Library(String id, String name, String address, Integer numBooks, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.numBooks = numBooks;
		this.books = books;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
