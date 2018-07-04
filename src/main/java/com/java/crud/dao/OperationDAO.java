package com.java.crud.dao;

import java.util.HashMap;

import model.Book;

public interface OperationDAO {
	public HashMap<String, Book>  getBookList() ;
	public void addBook(String id, Book book);
	public void removeBook(String id);
}
