package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareTest {

	@Test
	void testa() {
		Compare s = new Compare();
		assertTrue(s.negative(-100));
		assertFalse(s.negative(100));
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
		assertEquals(s.array123(a), true);
		assertEquals(s.array123(b), false);
		assertEquals(s.array123(c), true);
	}

	@Test
	void testl() {
		Compare s = new Compare();
		assertEquals(s.stringSplosion("Code"), "CCoCodCode");
		assertEquals(s.stringSplosion("abc"), "aababc");
		assertEquals(s.stringSplosion("ab"), "aab");
	}

	@Test
	void testm() {
		Compare s = new Compare();
		int a[] = { 1, 2, 7, 1 };
		int b[] = { 1, 2, 8, 1 };
		int c[] = { 2, 7, 1 };
		assertEquals(s.has271(a), true);
		assertEquals(s.has271(b), false);
		assertEquals(s.has271(c), true);
	}

	@Test
	void testn() {
		Compare s = new Compare();
		assertEquals(s.altPairs("kitten"), "kien");
		assertEquals(s.altPairs("chocolate"), "chole");
		assertEquals(s.altPairs("CodingHorror"), "Congrr");
	}

	@Test
	void testo() {
		Compare s = new Compare();
		assertEquals(s.countXX("abcxx"), 1);
		assertEquals(s.countXX("xxx"), 2);
		assertEquals(s.countXX("xxxx"), 3);
	}

	@Test
	void testp() {
		Compare s = new Compare();
		int a[] = { 1, 2, 9 };
		int b[] = { 1, 9, 9 };
		int c[] = { 1, 9, 9, 3, 9 };
		assertEquals(s.arrayCount9(a), 1);
		assertEquals(s.arrayCount9(b), 2);
		assertEquals(s.arrayCount9(c), 3);
	}

	@Test
	void testq() {
		Compare s = new Compare();
		assertEquals(s.diff21(19), 2);
		assertEquals(s.diff21(10), 11);
		assertEquals(s.diff21(21), 0);
	}

	@Test
	void testr() {
		Compare s = new Compare();
		int a[] = { 6, 6, 2 };
		int b[] = { 6, 6, 2, 6 };
		int c[] = { 6, 7, 2, 6 };
		assertEquals(s.array667(a), 1);
		assertEquals(s.array667(b), 1);
		assertEquals(s.array667(c), 1);
	}

	@Test
	void tests() {
		Compare s = new Compare();
		int a[] = { 1, 1, 2, 2, 1 };
		int b[] = { 1, 1, 2, 2, 2, 1 };
		int c[] = { 1, 1, 1, 2, 2, 2, 1 };
		assertEquals(s.noTriples(a), true);
		assertEquals(s.noTriples(b), false);
		assertEquals(s.noTriples(c), false);
	}

	@Test
	void testt() {
		Compare s = new Compare();
		assertEquals(s.notString("candy"), "not candy");
		assertEquals(s.notString("x"), "not x");
		assertEquals(s.notString("not bad"), "not bad");
	}

	@Test
	void testu() {
		Compare s = new Compare();
		int a[] = { 1, 2, 9, 3, 4 };
		int b[] = { 1, 2, 3, 4, 9 };
		int c[] = { 1, 2, 3, 4, 5, };
		assertEquals(s.arrayFront9(a), true);
		assertEquals(s.arrayFront9(b), false);
		assertEquals(s.arrayFront9(c), false);
	}

	@Test
	void testv() {
		Compare s = new Compare();
		assertEquals(s.endUp("Hello"), "HeLLO");
		assertEquals(s.endUp("hi there"), "hi thERE");
		assertEquals(s.endUp("hi"), "HI");
	}

	@Test
	void testw() {
		Compare s = new Compare();
		assertEquals(s.missingChar("kitten", 1), "ktten");
		assertEquals(s.missingChar("kitten", 0), "itten");
		assertEquals(s.missingChar("kitten", 4), "kittn");
	}
}
