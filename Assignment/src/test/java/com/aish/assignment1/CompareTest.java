package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareTest {

	@Test
	void testa() {
		
		Compare s=new Compare();
		assertTrue(s.negative(-100));
	}
	@Test
	void testequal() {
		
		Compare s=new Compare();
		assertTrue(s.equal(2, 2));
	}
	@Test
	void testc() {
		
		Compare s=new Compare();
		assertTrue(s.isequal("hello", "hello"));
	}
	
	@Test
	void testd() {
		Compare s=new Compare();
		assertTrue(s.equals("Hello", "hello"));
	}
	
}





