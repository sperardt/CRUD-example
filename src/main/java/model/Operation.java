package model;

import java.util.HashMap;
import java.util.Map;

public class Operation {
	private static Map<String, Book> bookList;

	public static Map<String, Book>  getBookList() {
		return bookList;
	}

	public static void setBookList(String id, Book book) {
		Map<String, Book> bookMap = new HashMap<String, Book>();
		bookMap.put(id, book);
		Operation.bookList = bookMap;
	}

	
}
