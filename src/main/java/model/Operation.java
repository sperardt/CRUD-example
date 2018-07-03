package model;

import java.util.Map;

public class Operation {
	private static Map<String, Book> bookList;

	public static Map<String, Book>  getBookList() {
		return bookList;
	}

	public static void setBookList(Map<String, Book>  bookList) {
		Operation.bookList = bookList;
	}

	
}
