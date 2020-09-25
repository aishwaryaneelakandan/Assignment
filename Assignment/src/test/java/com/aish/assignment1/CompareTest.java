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
	@Test
	void teste() {
		Compare s=new Compare();
		assertTrue(s.even(2));
	}
	@Test
	void testf() {
		Compare s=new Compare();
		assertTrue(s.odd(7));
	}
	@Test
	void testg() {
		Compare s=new Compare();
		assertTrue(s.palindrome("lol"));
	}
	@Test
	void testh() {
		Compare s=new Compare();
		assertTrue(s.isStringOnlyAlphabet("mango"));
	}
	@Test
	void testi() {
		Compare s=new Compare();
		assertNotNull(s.stringTimes("Hi", 2));
		assertNotNull(s.stringTimes("Hi", 3));
		assertNotNull(s.stringTimes("Hi", 1));
	}
	@Test
	void testj() {
		Compare s=new Compare();
		assertNotNull(s.frontTimes("Computer", 2));
		assertNotNull(s.frontTimes("Computer", 3));
		assertNotNull(s.frontTimes("Ram", 3));
	}
	}





