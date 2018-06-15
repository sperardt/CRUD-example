package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {
	Operation op;

	@Before
	public void setUp() {
		op = new Operation();
	}
	@Test
	public void booksNameTest() {
		assertNull(Operation.getBookList());
	}
}
