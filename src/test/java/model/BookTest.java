package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	Book book;

	@Before
	public void setUp() {
		book = new Book();
	}

	@Test
	public void booksNameTest() {
		assertNull(book.getName());
		
		
	}
}
