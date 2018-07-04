package model;

import java.util.HashMap;
import java.util.Map;

public class Operation {
	private HashMap<String, Book> bookList = new HashMap<String, Book>();

	public HashMap<String, Book>  getBookList() {
		return bookList;
	}

	public void setBookList(String id, Book book) {
		//HashMap<String, Book> bookMap = new HashMap<String, Book>();
		//bookMap.put(id, book);
		this.bookList.put(id, book);
	}

	
}
