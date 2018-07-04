package com.java.crud.dao;

import java.util.HashMap;

import model.Book;

public class OperationDAOImpl implements OperationDAO{
	private HashMap<String, Book> bookList = new HashMap<String, Book>();

	public HashMap<String, Book>  getBookList() {
		return bookList;
	}

	public void addBook(String id, Book book) {
		if (this.bookList.containsKey(id)) 
			this.bookList.replace(id, book);
		else this.bookList.put(id, book);
	}
	
	public void removeBook(String id) {
		if (this.bookList.containsKey(id)) 
			this.bookList.remove(id);
	}
	
}
