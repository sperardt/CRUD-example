package model;

import java.util.HashMap;

public class Operation {
	private HashMap<String, Book> bookList = new HashMap<String, Book>();

	public HashMap<String, Book>  getBookList() {
		return bookList;
	}

	public void setBookList(String id, Book book) {
		if (this.bookList.containsKey(id)) 
			this.bookList.replace(id, book);
		else this.bookList.put(id, book);
	}
	
	public void removeBook(String id) {
		if (this.bookList.containsKey(id)) 
			this.bookList.remove(id);
	}
	
}
