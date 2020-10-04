package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareAgainTest4 {

	@Test
	void testa() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.countHi2("ahixhi"), 1);
		assertEquals(s2.countHi2("ahibhi"), 2);
		assertEquals(s2.countHi2("xhixhi"), 0);
	}

	@Test
	void testb() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.strCount("catcowcat", "cat"), 2);
		assertEquals(s2.strCount("catcowcat", "cow"), 1);
		assertEquals(s2.strCount("catcowcat", "dog"), 0);
	}

	@Test
	void testc() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.bunnyEars(0), 0);
		assertEquals(s2.bunnyEars(1), 2);
		assertEquals(s2.bunnyEars(2), 4);
	}

	@Test
	void testd() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.triangle(0), 0);
		assertEquals(s2.triangle(1), 1);
		assertEquals(s2.triangle(2), 3);
	}

	@Test
	void teste() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.count8(8), 1);
		assertEquals(s2.count8(818), 2);
		assertEquals(s2.count8(8818), 4);
	}

	@Test
	void testf() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.countHi("xxhixx"), 1);
		assertEquals(s2.countHi("xhixhix"), 2);
		assertEquals(s2.countHi("hi"), 1);
	}

	@Test
	void testg() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.noX("xaxb"), "ab");
		assertEquals(s2.noX("abc"), "abc");
		assertEquals(s2.noX("xx"), "");
	}

	@Test
	void testh() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 1, 2, 20 };
		int b[] = { 3, 30 };
		int c[] = { 3 };
		assertEquals(s2.array220(a, 0), true);
		assertEquals(s2.array220(b, 0), true);
		assertEquals(s2.array220(c, 0), false);
	}

	@Test
	void testi() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.endX("xxre"), "rexx");
		assertEquals(s2.endX("xxhixx"), "hixxxx");
		assertEquals(s2.endX("xhixhix"), "hihixxx");
	}

	@Test
	void testj() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.count11("11abc11"), 2);
		assertEquals(s2.count11("abc11x11x11"), 3);
		assertEquals(s2.count11("111"), 1);
	}
}
