package model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.java.crud.dao.OperationDAOImpl;

public class OperationTest {
	Book book;
	OperationDAOImpl op;
	HashMap<String, Book> bookMap;
	
	@Before
	public void setUp() {
		book = new Book();
		op = new OperationDAOImpl();
		bookMap = new HashMap<String, Book>();
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(10.00);

	}
	
	@Test
	public void addBooksTest() {
		assertTrue(op.getBookList().isEmpty());
		
		op.addBook(book.getId(), book);	
		assertFalse(op.getBookList().isEmpty());
		assertEquals("Harry Potter",  op.getBookList().get("1").getName());
	}
	
	@Test
	public void UpdateSameBookTest() {
		
		op.addBook(book.getId(), book);	
		assertFalse(op.getBookList().isEmpty());
		assertEquals("Harry Potter",  op.getBookList().get("1").getName());
		
		book.setId("1");
		book.setName("NICK Potter");
		
		
		assertEquals("1", book.getId());
		op.addBook(book.getId(), book);
		assertTrue(op.getBookList().containsKey("1"));
			
		assertEquals("NICK Potter",  op.getBookList().get("1").getName());
		assertEquals(new Double(10.00),  op.getBookList().get("1").getPrice());
	
	}
	
	@Test
	public void addAnotherBookTest() {
		op.addBook(book.getId(), book);	
		assertEquals(1, op.getBookList().size());
		
		book = new Book();		
		book.setId("2");
		book.setName("Hunger Games");
			
		op.addBook(book.getId(), book);
	
		assertEquals(2, op.getBookList().size());
	}
	

	@Test
	public void removeABookTest() {
		op.addBook(book.getId(), book);	
		assertEquals(1, op.getBookList().size());
		
		book = new Book();		
		book.setId("2");
		book.setName("Hunger Games");
			
		op.addBook(book.getId(), book);
	
		assertEquals(2, op.getBookList().size());
		
		op.removeBook("1");
		assertEquals(1, op.getBookList().size());
	}
}
