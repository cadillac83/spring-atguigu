package com.hevispring.beans.basic;

import java.util.List;
import java.util.Map;

public class Libray {
	Map<String,List<Book>> books;

	
	public Map<String, List<Book>> getBooks() {
		return books;
	}


	public void setBooks(Map<String, List<Book>> books) {
		this.books = books;
	}


	@Override
	public String toString() {
		return "Libray [books=" + books + "]";
	}
	
	
	
}
