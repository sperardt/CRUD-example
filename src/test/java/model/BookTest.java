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
		String name = "Harry Potter";
		book.setName(name);
		assertEquals(name, book.getName());
	}
	@Test
	public void booksIdTest() {
		assertNull(book.getId());
	}
}
