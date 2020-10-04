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

	@Test
	void testk() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.parenBit("xyz(abc)123"), "(abc)");
		assertEquals(s2.parenBit("x(hello)"), "(hello)");
		assertEquals(s2.parenBit("(xy)1"), "(xy)");
	}

	@Test
	void testl() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.strCopies("catcowcat", "cat", 2), true);
		assertEquals(s2.strCopies("catcowcat", "cow", 2), false);
		assertEquals(s2.strCopies("catcowcat", "cow", 1), true);
	}

	@Test
	void testm() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.fibonacci(0), 0);
		assertEquals(s2.fibonacci(1), 1);
		assertEquals(s2.fibonacci(2), 1);
	}

	@Test
	void testn() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.sumDigits(126), 9);
		assertEquals(s2.sumDigits(49), 13);
		assertEquals(s2.sumDigits(12), 3);
	}

	@Test
	void testo() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.powerN(3, 1), 3);
		assertEquals(s2.powerN(3, 2), 9);
		assertEquals(s2.powerN(3, 3), 27);
	}

	@Test
	void testp() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.changeXY("codex"), "codey");
		assertEquals(s2.changeXY("xxhixx"), "yyhiyy");
		assertEquals(s2.changeXY("xhixhix"), "yhiyhiy");
	}

	@Test
	void testq() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 1, 6, 4 };
		int b[] = { 1, 4 };
		int c[] = { 6 };
		assertEquals(s2.array6(a, 0), true);
		assertEquals(s2.array6(b, 0), false);
		assertEquals(s2.array6(c, 0), true);
	}

	@Test
	void testr() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.allStar("hello"), "h*e*l*l*o");
		assertEquals(s2.allStar("xxyy"), "x*x*y*y");
		assertEquals(s2.allStar("aaaa"), "a*a*a*a");
	}

	@Test
	void tests() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.countPairs("axa"), 1);
		assertEquals(s2.countPairs("axax"), 2);
		assertEquals(s2.countPairs("axbx"), 1);
	}

	@Test
	void testt() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.stringClean("yyzzza"), "yza");
		assertEquals(s2.stringClean("abbbcdd"), "abcd");
		assertEquals(s2.stringClean("Hello"), "Helo");
	}
	@Test
	void testu() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.nestParen("(())"), true);
		assertEquals(s2.nestParen("((()))"), true);
		assertEquals(s2.nestParen("(((x))"), false);
	}

	@Test
	void testv() {
		CompareAgain4 s2 = new CompareAgain4();
		assertEquals(s2.strDist("catcowcat", "cat"), 9);
		assertEquals(s2.strDist("catcowcat", "cow"), 3);
		assertEquals(s2.strDist("cccatcowcatxx", "cat"), 9);
	}

	@Test
	void testw() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 2, 4, 8 };
		int b[] = { 2, 4, 8 };
		int c[] = { 2, 4, 8 };
		assertEquals(s2.groupSum(0, a, 10), true);
		assertEquals(s2.groupSum(0, b, 14), true);
		assertEquals(s2.groupSum(0, c, 9), false);
	}

	@Test
	void testx() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 2, 5, 10, 4 };
		int b[] = { 2, 5, 10, 4 };
		int c[] = { 2, 5, 10, 4 };
		assertEquals(s2.groupSum5(0, a, 19), true);
		assertEquals(s2.groupSum5(0, b, 17), true);
		assertEquals(s2.groupSum5(0, c, 12), false);
	}

	@Test
	void testy() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 5, 5, 5 };
		int b[] = { 5, 5, 6 };
		int c[] = { 5, 5, 6, 1 };
		assertEquals(s2.splitOdd10(a), true);
		assertEquals(s2.splitOdd10(b), false);
		assertEquals(s2.splitOdd10(c), true);
	}

	@Test
	void testz() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 5, 6, 2 };
		int b[] = { 5, 6, 2 };
		int c[] = { 5, 6, 2 };
		assertEquals(s2.groupSum6(0, a, 8), true);
		assertEquals(s2.groupSum6(0, b, 9), false);
		assertEquals(s2.groupSum6(0, c, 7), false);
	}

	@Test
	void testa1() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 2, 4, 8 };
		int b[] = { 1, 2, 4, 8, 1 };
		int c[] = { 2, 4, 4, 8 };
		assertEquals(s2.groupSumClump(0, a, 10), true);
		assertEquals(s2.groupSumClump(0, b, 14), true);
		assertEquals(s2.groupSumClump(0, c, 14), false);
	}

	@Test
	void testb1() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 1, 1 };
		int b[] = { 1, 1, 1 };
		int c[] = { 2, 4, 2 };
		assertEquals(s2.split53(a), true);
		assertEquals(s2.split53(b), false);
		assertEquals(s2.split53(c), true);
	}

	@Test
	void testc1() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 2, 5, 10, 4 };
		int b[] = { 2, 5, 10, 4 };
		int c[] = { 2, 5, 10, 4 };
		assertEquals(s2.groupNoAdj(0, a, 12), true);
		assertEquals(s2.groupNoAdj(0, b, 14), false);
		assertEquals(s2.groupNoAdj(0, c, 7), false);
	}

	@Test
	void testd1() {
		CompareAgain4 s2 = new CompareAgain4();
		int a[] = { 2, 2 };
		int b[] = { 2, 3 };
		int c[] = { 5, 2, 3 };
		assertEquals(s2.splitArray(a), true);
		assertEquals(s2.splitArray(b), false);
		assertEquals(s2.splitArray(c), true);
	}


}
