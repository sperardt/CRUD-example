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
	
	@Before
	public void setUp() {
		book = new Book();
		op = new Operation();
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(10.00);

	}
	
	@Test
	public void addBooksTest() {
		//assertNull(Operation.getBookList());
		
		op.setBookList(book.getId(), book);	
		assertFalse(op.getBookList().isEmpty());
		assertEquals("Harry Potter",  op.getBookList().get("1").getName());
	}
	
	@Test
	public void addSameBookTest() {
		
		op.setBookList(book.getId(), book);	
		assertFalse(op.getBookList().isEmpty());
		assertEquals("Harry Potter",  op.getBookList().get("1").getName());
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(50.00);
		
		op.setBookList(book.getId(), book);	
		assertEquals(new Double(50.00),  op.getBookList().get("2").getPrice());

	
	}
}
