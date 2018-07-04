package model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {
	Book book;
	Operation op;
	HashMap<String, Book> bookMap;
	
	@Before
	public void setUp() {
		book = new Book();
		op = new Operation();
		bookMap = new HashMap<String, Book>();
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(10.00);

	}
	
	@Test
	public void addBooksTest() {
		assertTrue(op.getBookList().isEmpty());
		
		op.setBookList(book.getId(), book);	
		assertFalse(op.getBookList().isEmpty());
		assertEquals("Harry Potter",  op.getBookList().get("1").getName());
	}
	
	@Test
	public void UpdateSameBookTest() {
		
		op.setBookList(book.getId(), book);	
		assertFalse(op.getBookList().isEmpty());
		assertEquals("Harry Potter",  op.getBookList().get("1").getName());
		
		book.setId("1");
		book.setName("NICK Potter");
		
		
		assertEquals("1", book.getId());
		op.setBookList(book.getId(), book);
		assertTrue(op.getBookList().containsKey("1"));
			
		assertEquals("NICK Potter",  op.getBookList().get("1").getName());
		assertEquals(new Double(10.00),  op.getBookList().get("1").getPrice());
	
	}
	
	@Test
	public void addAnotherBookTest() {
		op.setBookList(book.getId(), book);	
		assertEquals(1, op.getBookList().size());
		
		book = new Book();		
		book.setId("2");
		book.setName("Hunger Games");
			
		op.setBookList(book.getId(), book);
	
		assertEquals(2, op.getBookList().size());
	}
	

	@Test
	public void removeABookTest() {
		op.setBookList(book.getId(), book);	
		assertEquals(1, op.getBookList().size());
		
		book = new Book();		
		book.setId("2");
		book.setName("Hunger Games");
			
		op.setBookList(book.getId(), book);
	
		assertEquals(2, op.getBookList().size());
		
		op.removeBook("1");
		assertEquals(1, op.getBookList().size());
	}
}
