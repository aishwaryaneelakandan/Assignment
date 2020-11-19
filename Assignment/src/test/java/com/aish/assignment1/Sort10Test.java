package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sort10Test {

	@Test
	void test1() {
		Sort10 s10 = new Sort10();
		int a[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		assertArrayEquals(new int[] { 23, 23, 23, 34, 45, 65, 67, 89, 90, 101 }, s10.q3(a));
	}

	@Test
	void test2() {
		Sort10 s10 = new Sort10();
		int a[] = { 1, 12, 15, 26, 38 };
		int a1[] = { 2, 13, 17, 30, 45 };
		int n = 16;
		assertTrue(s10.q2(a, a1, n));
	}
	@Test
	void test3() {
		Sort10 s10 = new Sort10();
		int a[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		assertArrayEquals(new int[] { 23, 23, 23, 34, 45, 65, 67, 89, 90, 101 }, s10.q3(a));
	}

	@Test
	void test4() {
		Sort10 s10 = new Sort10();
		int a[] = { 2, 3, 5, 3, 7, 9, 5, 3, 7 };
		int n = 3;
		assertEquals(s10.q4(a, n, 8), 3);
	}
}
