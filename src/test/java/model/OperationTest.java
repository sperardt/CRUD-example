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
		
		bookList.put(book.getId(), book);
	}
	
	@Test
	public void addBooksTest() {
		//assertNull(Operation.getBookList());
		assertFalse(bookList.isEmpty());
		assertEquals("Harry Potter", bookList.get("1").getName());
		
		Operation.setBookList(bookList);	
		assertEquals("Harry Potter",  Operation.getBookList().get("1").getName());
		
		
//		
//		book.setId("2");
//		book.setName("Hunger games");
//		book.setNumberPages(300);
//		book.setPrice(15.00);
//		
//		bookList.add(book);
//		Operation.setBookList(bookList);	
//		
//		assertEquals(2, Operation.getBookList().size());
	}
	
}
