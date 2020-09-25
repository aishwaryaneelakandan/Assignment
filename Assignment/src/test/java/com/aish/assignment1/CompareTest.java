package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareTest {

	@Test
	void testa() {
		Compare s = new Compare();
		assertTrue(s.negative(-100));
	}

	@Test
	void testequal() {
        Compare s = new Compare();
		assertTrue(s.equal(2, 2));
	}

	@Test
	void testc() {
        Compare s = new Compare();
		assertTrue(s.isequal("hello", "hello"));
	}

	@Test
	void testd() {
		Compare s = new Compare();
		assertTrue(s.equals("Hello", "hello"));
	}

	@Test
	void teste() {
		Compare s = new Compare();
		assertTrue(s.even(2));
	}

	@Test
	void testf() {
		Compare s = new Compare();
		assertTrue(s.odd(7));
	}

	@Test
	void testg() {
		Compare s = new Compare();
		assertTrue(s.palindrome("lol"));
	}

	@Test
	void testh() {
		Compare s = new Compare();
		assertTrue(s.isStringOnlyAlphabet("mango"));
	}

	@Test
	void testi() {
		Compare s = new Compare();
		assertEquals(s.stringTimes("Hi", 2), "HiHi");
		assertEquals(s.stringTimes("Hi", 3), "HiHiHi");
		assertEquals(s.stringTimes("Hi", 1), "Hi");
	}

	@Test
	void testj() {
		Compare s = new Compare();
		assertEquals(s.frontTimes("Chocolate", 2), "ChoCho");
		assertEquals(s.frontTimes("Chocolate", 3), "ChoChoCho");
		assertEquals(s.frontTimes("Abc", 3), "AbcAbcAbc");
	}

	@Test
	void testk() {
		Compare s = new Compare();
		int a[] = { 1, 1, 2, 3, 1 };
		int b[] = { 1, 1, 2, 4, 1 };
		int c[] = { 1, 1, 2, 1, 2, 3 };
		assertEquals(s.array123(a),"{1,1,2,3,1}");
		assertEquals(s.array123(b),"{1,1,2,4,1}");
		assertEquals(s.array123(c),"{1,1,2,1,2,3}");
	}

	@Test
	void testl() {
		Compare s = new Compare();
		assertEquals(s.stringSplosion("Code"), "CCoCodCode");
		assertEquals(s.stringSplosion("abc"), "aababc");
		assertEquals(s.stringSplosion("ab"), "aab");
	}
}
