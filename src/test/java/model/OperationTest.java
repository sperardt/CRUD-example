package model;

import static org.junit.Assert.assertEquals;

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
		assertNull(op.getBookList());
	}
}
