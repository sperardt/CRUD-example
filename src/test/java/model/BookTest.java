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
		String id = "1a3";
		book.setId(id);
		assertEquals(id, book.getId());
	}
	
	@Test
	public void booksNumberPagesTest() {
		Integer numberOfPages = 130;
		book.setNumberPages(numberOfPages);
		assertEquals(numberOfPages, book.getNumberPages());
	}

	@Test
	public void booksPriceTest() {
		Double price = 13.60;
		book.setPrice(price);
		assertEquals(price, book.getPrice());
	}
}
