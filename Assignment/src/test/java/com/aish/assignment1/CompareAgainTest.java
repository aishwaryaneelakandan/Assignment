package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CompareAgainTest {
	@Test
	void testa() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3, 2, 5, 2 };
		int c[] = { 3, 4 };
		assertArrayEquals(new int[] { 1, 3, 3 }, s1.notAlone(a, 2));
		assertArrayEquals(new int[] { 1, 3, 3, 5, 5, 2 }, s1.notAlone(b, 2));
		assertArrayEquals(new int[] { 3, 4 }, s1.notAlone(c, 3));
	}

	@Test
	void testb() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 0, 5, 0, 3 };
		int b[] = { 0, 4, 0, 3 };
		int c[] = { 0, 1, 0 };
		assertArrayEquals(new int[] { 5, 5, 3, 3 }, s1.zeroMax(a));
		assertArrayEquals(new int[] { 3, 4, 3, 3 }, s1.zeroMax(b));
		assertArrayEquals(new int[] { 1, 1, 0 }, s1.zeroMax(c));
	}

	@Test
	void testc() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 1, 2, 3, 4, 100 };
		int b[] = { 1, 1, 5, 5, 10, 8, 7 };
		int c[] = { -10, -4, -2, -4, -2, 0 };
		assertEquals(s1.centeredAverage(a), 3);
		assertEquals(s1.centeredAverage(b), 5);
		assertEquals(s1.centeredAverage(c), -3);
	}

	@Test
	void testd() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 1, 2, 2 };
		int b[] = { 1, 2, 1, 2 };
		int c[] = { 2, 1, 2 };
		assertEquals(s1.has22(a), true);
		assertEquals(s1.has22(b), false);
		assertEquals(s1.has22(c), false);
	}

	@Test
	void teste() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 1, 4, 1 };
		int b[] = { 1, 4, 1, 4 };
		int c[] = { 1, 1 };
		assertEquals(s1.more14(a), true);
		assertEquals(s1.more14(b), false);
		assertEquals(s1.more14(c), true);
	}

	@Test
	void testf() {
		CompareAgain s1 = new CompareAgain();
		assertArrayEquals(new String[] { "0", "1", "2", "3" }, s1.fizzArray2(4));
		assertArrayEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }, s1.fizzArray2(10));
		assertArrayEquals(new String[] { "0", "1" }, s1.fizzArray2(2));
	}

	@Test
	void testg() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 1, 2, 2 };
		int b[] = { 4, 4, 1 };
		int c[] = { 4, 4, 1, 2, 2 };
		assertEquals(s1.either24(a), true);
		assertEquals(s1.either24(b), true);
		assertEquals(s1.either24(c), false);
	}

	@Test
	void testh() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 1, 3, 2 };
		int b[] = { 3, 1, 2 };
		int c[] = { 3, 1, 4, 5, 2 };
		assertEquals(s1.has12(a), true);
		assertEquals(s1.has12(b), true);
		assertEquals(s1.has12(c), true);
	}

	@Test
	void testi() {
		CompareAgain s1 = new CompareAgain();
		int a[] = { 4, 2, 2, 3 };
		int b[] = { 2, 2, 4 };
		int c[] = { 2, 2, 4, 2 };
		assertEquals(s1.twoTwo(a), true);
		assertEquals(s1.twoTwo(b), true);
		assertEquals(s1.twoTwo(c), false);
	}

	@Test
	void testj() {
		CompareAgain s1 = new CompareAgain();
		assertArrayEquals(new int[] { 5, 6, 7, 8, 9 }, s1.fizzArray3(5, 10));
		assertArrayEquals(new int[] { 11, 12, 13, 14, 15, 16, 17 }, s1.fizzArray3(11, 18));
		assertArrayEquals(new int[] { 1, 2 }, s1.fizzArray3(1, 3));
	}

}
