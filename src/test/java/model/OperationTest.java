package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {
	ArrayList<Book> bookList;
	Book book;

	@Before
	public void setUp() {
		bookList = new ArrayList<Book>();
		book = new Book();
		
		book.setId("1");
		book.setName("Harry Potter");
		book.setNumberPages(500);
		book.setPrice(10.00);
		
		bookList.add(book);
	}
	
	@Test
	public void getBooksTest() {
		assertNull(Operation.getBookList());

		Operation.setBookList(bookList);	
		assertEquals(1, Operation.getBookList().size());
	}
}
