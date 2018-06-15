package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {
	Operation op;

	@Before
	public void setUp() {
		op = new Operation();
		
	}
	
	@Test
	public void getBooksTest() {
		assertNull(Operation.getBookList());
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book book = new Book();
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(10.00);
		
		bookList.add(book);
		Operation.setBookList(bookList);
		
		assertEquals(1, Operation.getBookList().size());
	}
}
