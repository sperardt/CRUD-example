package model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {
	Map<String, Book> bookList;
	Book book;

	@Before
	public void setUp() {
		bookList = new HashMap<String, Book>();
		book = new Book();
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(10.00);

	}
	
	@Test
	public void addBooksTest() {
		assertNull(Operation.getBookList());
		
		Operation.setBookList(book.getId(), book);	
		assertFalse(Operation.getBookList().isEmpty());
		assertEquals("Harry Potter",  Operation.getBookList().get("1").getName());
	}
	
}
