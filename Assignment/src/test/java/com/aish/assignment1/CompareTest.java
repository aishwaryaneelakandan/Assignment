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

	@Test
	void testx() {
		Compare s = new Compare();
		assertEquals(s.doubleChar("The"), "TThhee");
		assertEquals(s.doubleChar("AAbb"), "AAAAbbbb");
		assertEquals(s.doubleChar("Hi-There"), "HHii--TThheerree");
	}

	@Test
	void testy() {
		Compare s = new Compare();
		assertEquals(s.countCode("aaacodebbb"), 1);
		assertEquals(s.countCode("codexxcode"), 2);
		assertEquals(s.countCode("cozexxcope"), 2);
	}

	@Test
	void testz() {
		Compare s = new Compare();
		assertEquals(s.bobThere("abcbob"), true);
		assertEquals(s.bobThere("b9b"), true);
		assertEquals(s.countCode("bac"), 0);
	}

	@Test
	void testa1() {
		Compare s = new Compare();
		assertEquals(s.repeatEnd("Hello", 3), "llollollo");
		assertEquals(s.repeatEnd("Hello", 2), "lolo");
		assertEquals(s.repeatEnd("Hello", 1), "o");
	}

	@Test
	void testb1() {
		Compare s = new Compare();
		assertEquals(s.prefixAgain("abXYabc", 1), true);
		assertEquals(s.prefixAgain("abXYabc", 2), true);
		assertEquals(s.prefixAgain("abXYabc", 3), false);
	}

	@Test
	void testc1() {
		Compare s = new Compare();
		assertEquals(s.sameStarChar("*xy*yzz"), true);
		assertEquals(s.sameStarChar("xy*zzz"), false);
		assertEquals(s.sameStarChar("*xa*az"), true);
	}

	@Test
	void testd1() {
		Compare s = new Compare();
		String x1 = "ab*cd";
		String x2 = "ab**cd";
		String x3 = "sm*eilly";
		assertEquals(s.starOut(x1), "ad");
		assertEquals(s.starOut(x2), "ad");
		assertEquals(s.starOut(x3), "silly");
	}

	@Test
	void teste1() {
		Compare s = new Compare();
		assertEquals(s.endOther("Hiabc", "abc"), true);
		assertEquals(s.endOther("Abc", "HiaBc"), true);
		assertEquals(s.endOther("abc", "abXabc"), true);
	}

	@Test
	void testf1() {
		Compare s = new Compare();
		assertEquals(s.xyBalance("aaxbby"), true);
		assertEquals(s.xyBalance("aaxbb"), false);
		assertEquals(s.xyBalance("yaaxbb"), false);
	}

	@Test
	void testg1() {
		Compare s = new Compare();
		assertEquals(s.repeatFront("Chocolate", 4), "ChocChoChC");
		assertEquals(s.repeatFront("Chocolate", 3), "ChoChC");
		assertEquals(s.repeatFront("Chocolate", 2), "ChC");
	}

	@Test
	void testh1() {
		Compare s = new Compare();
		assertEquals(s.xyzMiddle("AAxyzBB"), true);
		assertEquals(s.xyzMiddle("AxyzBB"), true);
		assertEquals(s.xyzMiddle("AxyzBBB"), false);
	}

	@Test
	void testi1() {
		Compare s = new Compare();
		assertEquals(s.oneTwo("abc"), "bca");
		assertEquals(s.oneTwo("tca"), "cat");
		assertEquals(s.oneTwo("tcagdo"), "catdog");
	}

	@Test
	void testj1() {
		Compare s = new Compare();
		assertEquals(s.plusOut("12xy34", "xy"), "++xy++");
		assertEquals(s.plusOut("12xy34", "1"), "1+++++");
		assertEquals(s.plusOut("12xy34xyabcxy", "xy"), "++xy++xy+++xy");
	}

	@Test
	void testk1() {
		Compare s = new Compare();
		assertEquals(s.catDog("catdog"), true);
		assertEquals(s.catDog("catcat"), false);
		assertEquals(s.catDog("1cat1cadodog"), true);
	}

	@Test
	void testl1() {
		Compare s = new Compare();
		assertEquals(s.xyzThere("abcxyz"), true);
		assertEquals(s.xyzThere("abc.xyz"), false);
		assertEquals(s.xyzThere("xyz.abc"), true);
	}

	@Test
	void testm1() {
		Compare s = new Compare();
		assertEquals(s.mixString("abc", "xyz"), "axbycz");
		assertEquals(s.mixString("Hi", "There"), "HTihere");
		assertEquals(s.mixString("xxxx", "There"), "xTxhxexre");
	}

	@Test
	void testn1() {
		Compare s = new Compare();
		assertEquals(s.repeatSeparator("Word", "X", 3), "WordXWordXWord");
		assertEquals(s.repeatSeparator("This", "And", 2), "ThisAndThis");
		assertEquals(s.repeatSeparator("This", "And", 1), "This");
	}

	@Test
	void testo1() {
		Compare s = new Compare();
		assertEquals(s.getSandwich("breadjambread"), "jam");
		assertEquals(s.getSandwich("xxbreadjambreadyy"), "jam");
		assertEquals(s.getSandwich("xxbreadyy"), "");
	}

	@Test
	void testp1() {
		Compare s = new Compare();
		assertEquals(s.zipZap("zipXzap"), "zpXzp");
		assertEquals(s.zipZap("zopzop"), "zpzp");
		assertEquals(s.zipZap("zzzopzop"), "zzzpzp");
	}

	@Test
	void testq1() {
		Compare s = new Compare();
		assertEquals(s.wordEnds("abcXY123XYijk", "XY"), "c13i");
		assertEquals(s.wordEnds("XY123XY", "XY"), "13");
		assertEquals(s.wordEnds("XY1XY", "XY"), "11");
	}

	@Test
	void testr1() {
		Compare s = new Compare();
		int a[] = { 1, 2, 6 };
		int b[] = { 6, 1, 2, 3 };
		int c[] = { 13, 6, 1, 2, 3 };
		assertEquals(s.firstLast6(a), true);
		assertEquals(s.firstLast6(b), true);
		assertEquals(s.firstLast6(c), false);
	}

	@Test
	void tests1() {
		Compare s = new Compare();
		int a1[] = { 1, 2, 3 };
		int b1[] = { 7, 3 };
		int a2[] = { 1, 2, 3 };
		int b2[] = { 7, 3, 2 };
		int a3[] = { 1, 2, 3 };
		int b3[] = { 1, 3 };
		assertEquals(s.commonEnd(a1, b1), true);
		assertEquals(s.commonEnd(a2, b2), false);
		assertEquals(s.commonEnd(a3, b3), true);
	}

	@Test
	void testt1() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 5, 11, 9 };
		int c[] = { 7, 0, 0 };
		assertArrayEquals(new int[] { 3, 2, 1 }, s.reverse3(a));
		assertArrayEquals(new int[] { 9, 11, 5 }, s.reverse3(b));
		assertArrayEquals(new int[] { 0, 0, 7 }, s.reverse3(c));
	}

	@Test
	void testu1() {
		Compare s = new Compare();
		int a1[] = { 1, 2, 3 };
		int b1[] = { 4, 5, 6 };
		int a2[] = { 7, 7, 7 };
		int b2[] = { 3, 8, 0 };
		int a3[] = { 5, 2, 9 };
		int b3[] = { 1, 4, 5 };
		assertArrayEquals(new int[] { 2, 5 }, s.middleWay(a1, b1));
		assertArrayEquals(new int[] { 7, 8 }, s.middleWay(a2, b2));
		assertArrayEquals(new int[] { 2, 4 }, s.middleWay(a3, b3));
	}

	@Test
	void testv1() {
		Compare s = new Compare();
		int a[] = { 4, 5 };
		int b[] = { 4, 2 };
		int c[] = { 3, 5 };
		assertEquals(s.no23(a), true);
		assertEquals(s.no23(b), false);
		assertEquals(s.no23(c), false);
	}

	@Test
	void testw1() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 2, 3, 5 };
		int c[] = { 1, 2, 1 };
		assertArrayEquals(new int[] { 1, 2, 0 }, s.fix23(a));
		assertArrayEquals(new int[] { 2, 0, 5 }, s.fix23(b));
		assertArrayEquals(new int[] { 1, 2, 1 }, s.fix23(c));
	}

	@Test
	void testx1() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 7, 1, 2, 3, 4, 9 };
		int c[] = { 1, 2 };
		assertArrayEquals(new int[] { 2, 3 }, s.makeMiddle(a));
		assertArrayEquals(new int[] { 2, 3 }, s.makeMiddle(b));
		assertArrayEquals(new int[] { 1, 2 }, s.makeMiddle(c));
		;
	}

	@Test
	void testy1() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 8, 6, 7, 5, 3, 0, 9 };
		int c[] = { 1, 2, 3 };
		assertArrayEquals(new int[] { 2, 3, 4 }, s.midThree(a));
		assertArrayEquals(new int[] { 7, 5, 3 }, s.midThree(b));
		assertArrayEquals(new int[] { 1, 2, 3 }, s.midThree(c));
	}

	@Test
	void testz1() {
		Compare s = new Compare();
		int a[] = { 1, 3, 4, 5 };
		int b[] = { 2, 1, 3, 4, 5 };
		int c[] = { 1, 1, 1 };
		assertEquals(s.unlucky1(a), true);
		assertEquals(s.unlucky1(b), true);
		assertEquals(s.unlucky1(c), false);
	}

	@Test
	void testa2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3, 1 };
		int c[] = { 1, 2, 1 };
		assertEquals(s.sameFirstLast(a), false);
		assertEquals(s.sameFirstLast(b), true);
		assertEquals(s.sameFirstLast(c), true);
	}

	@Test
	void testb2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 5, 11, 2 };
		int c[] = { 7, 0, 0 };
		assertEquals(s.sum3(a), 6);
		assertEquals(s.sum3(b), 18);
		assertEquals(s.sum3(c), 7);
	}

	@Test
	void testc2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 11, 5, 9 };
		int c[] = { 2, 11, 3 };
		assertArrayEquals(new int[] { 3, 3, 3 }, s.maxEnd3(a));
		assertArrayEquals(new int[] { 11, 11, 11 }, s.maxEnd3(b));
		assertArrayEquals(new int[] { 3, 3, 3 }, s.maxEnd3(c));
	}

	@Test
	void testd2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3, 4 };
		int c[] = { 7, 4, 6, 2 };
		assertArrayEquals(new int[] { 1, 3 }, s.makeEnds(a));
		assertArrayEquals(new int[] { 1, 4 }, s.makeEnds(b));
		assertArrayEquals(new int[] { 7, 2 }, s.makeEnds(c));
	}

	@Test
	void teste2() {
		Compare s = new Compare();
		int a[] = { 4, 5, 6 };
		int b[] = { 1, 2 };
		int c[] = { 3 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 6 }, s.makeLast(a));
		assertArrayEquals(new int[] { 0, 0, 0, 2 }, s.makeLast(b));
		assertArrayEquals(new int[] { 0, 3 }, s.makeLast(c));
	}

	@Test
	void testf2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 3 };
		int a1[] = { 7, 2, 3 };
		int b1[] = { 1 };
		int a2[] = { 1, 2 };
		int b2[] = {};
		assertEquals(s.start1(a, b), 2);
		assertEquals(s.start1(a1, b1), 1);
		assertEquals(s.start1(a2, b2), 1);
	}

	@Test
	void testg2() {
		Compare s = new Compare();
		int a[] = { 1, 2 };
		int b[] = { 3, 4 };
		int a1[] = { 4, 4 };
		int b1[] = { 2, 2 };
		int a2[] = { 9, 2 };
		int b2[] = { 3, 4 };
		assertArrayEquals(new int[] { 1, 2, 3, 4 }, s.plusTwo(a, b));
		assertArrayEquals(new int[] { 4, 4, 2, 2 }, s.plusTwo(a1, b1));
		assertArrayEquals(new int[] { 9, 2, 3, 4 }, s.plusTwo(a2, b2));
	}

	@Test
	void testh2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 5, 3 };
		int c[] = { 5, 2, 3 };
		assertEquals(s.maxTriple(a), 3);
		assertEquals(s.maxTriple(b), 5);
		assertEquals(s.maxTriple(c), 5);
	}

	@Test
	void testi2() {
		Compare s = new Compare();
		int a[] = { 4, 5 };
		int b[] = { 1, 2, 3 };
		int a1[] = { 4 };
		int b1[] = { 1, 2, 3 };
		int a2[] = {};
		int b2[] = { 1, 2 };
		assertArrayEquals(new int[] { 4, 5 }, s.make2(a, b));
		assertArrayEquals(new int[] { 4, 1 }, s.make2(a1, b1));
		assertArrayEquals(new int[] { 1, 2 }, s.make2(a2, b2));
	}

	@Test
	void testj2() {
		Compare s = new Compare();
		assertArrayEquals(new int[] { 3, 1, 4 }, s.makePi());
	}

	@Test
	void testk2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 5, 11, 9 };
		int c[] = { 7, 0, 0 };
		assertArrayEquals(new int[] { 2, 3, 1 }, s.rotateLeft3(a));
		assertArrayEquals(new int[] { 11, 9, 5 }, s.rotateLeft3(b));
		assertArrayEquals(new int[] { 0, 0, 7 }, s.rotateLeft3(c));
	}

	@Test
	void testl2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 1 };
		int c[] = { 1, 1, 1, 1 };
		assertEquals(s.sum2(a), 3);
		assertEquals(s.sum2(b), 2);
		assertEquals(s.sum2(c), 2);
	}

	@Test
	void testm2() {
		Compare s = new Compare();
		int a[] = { 2, 5 };
		int b[] = { 4, 3 };
		int c[] = { 4, 5 };
		assertEquals(s.has23(a), true);
		assertEquals(s.has23(b), true);
		assertEquals(s.has23(c), false);
	}

	@Test
	void testn2() {
		Compare s = new Compare();
		int a[] = { 2, 2 };
		int b[] = { 3, 3 };
		int c[] = { 2, 3 };
		assertEquals(s.double23(a), true);
		assertEquals(s.double23(b), true);
		assertEquals(s.double23(c), false);
	}

	@Test
	void testo2() {
		Compare s = new Compare();
		int a[] = { 1, 2 };
		int b[] = { 3, 4 };
		int a1[] = { 3, 4 };
		int b1[] = { 1, 2 };
		int a2[] = { 1, 1 };
		int b2[] = { 1, 2 };
		assertArrayEquals(new int[] { 3, 4 }, s.biggerTwo(a, b));
		assertArrayEquals(new int[] { 3, 4 }, s.biggerTwo(a1, b1));
		assertArrayEquals(new int[] { 1, 2 }, s.biggerTwo(a2, b2));
	}

	@Test
	void testp2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3 };
		int c[] = { 8, 6, 7, 9, 5 };
		assertArrayEquals(new int[] { 4, 2, 3, 1 }, s.swapEnds(a));
		assertArrayEquals(new int[] { 3, 2, 1 }, s.swapEnds(b));
		assertArrayEquals(new int[] { 5, 6, 7, 9, 8 }, s.swapEnds(c));
	}

	@Test
	void testq2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2 };
		int c[] = { 1 };
		assertArrayEquals(new int[] { 1, 2 }, s.frontPiece(a));
		assertArrayEquals(new int[] { 1, 2 }, s.frontPiece(b));
		assertArrayEquals(new int[] { 1 }, s.frontPiece(c));
	}

	@Test
	void testr2() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 7, 9, 8 };
		int a1[] = { 1 };
		int b1[] = { 2 };
		int a2[] = { 1, 7 };
		int b2[] = {};
		assertArrayEquals(new int[] { 1, 7 }, s.front11(a, b));
		assertArrayEquals(new int[] { 1, 2 }, s.front11(a1, b1));
		assertArrayEquals(new int[] { 1 }, s.front11(a2, b2));
	}

	@Test
	void tests2() {
		Compare s = new Compare();
		assertEquals(s.countYZ("fez day"), 2);
		assertEquals(s.countYZ("day fez"), 2);
		assertEquals(s.countYZ("day fyyyz"), 2);
	}

	@Test
	void testt2() {
		Compare s = new Compare();
		assertEquals(s.gHappy("xxggxx"), true);
		assertEquals(s.gHappy("xxgxx"), false);
		assertEquals(s.gHappy("xxggyygxx"), false);
	}

	@Test
	void testu2() {
		Compare s = new Compare();
		assertEquals(s.sameEnds("abXYab"), "ab");
		assertEquals(s.sameEnds("xx"), "x");
		assertEquals(s.sameEnds("xxx"), "x");
	}

	@Test
	void testv2() {
		Compare s = new Compare();
		assertEquals(s.sumNumbers("abc123xyz"), 123);
		assertEquals(s.sumNumbers("aa11b33"), 44);
		assertEquals(s.sumNumbers("7 11"), 18);
	}

	@Test
	void testw2() {
		Compare s = new Compare();
		assertEquals(s.withoutString("Hello there", "llo"), "He there");
		assertEquals(s.withoutString("Hello there", "e"), "Hllo thr");
		assertEquals(s.withoutString("Hello there", "x"), "Hello there");
	}

	@Test
	void testx2() {
		Compare s = new Compare();
		assertEquals(s.countTriple("abcXXXabc"), 1);
		assertEquals(s.countTriple("xxxabyyyycd"), 3);
		assertEquals(s.countTriple("a"), 0);
	}

	@Test
	void testy2() {
		Compare s = new Compare();
		assertEquals(s.mirrorEnds("abXYZba"), "ab");
		assertEquals(s.mirrorEnds("abca"), "a");
		assertEquals(s.mirrorEnds("aba"), "aba");
	}

	@Test
	void testz2() {
		Compare s = new Compare();
		assertEquals(s.notReplace("is test"), "is not test");
		assertEquals(s.notReplace("is-is"), "is not-is not");
		assertEquals(s.notReplace("This is right"), "This is not right");
	}

	@Test
	void testa3() {
		Compare s = new Compare();
		assertEquals(s.equalIsNot("This is not"), false);
		assertEquals(s.equalIsNot("This is notnot"), true);
		assertEquals(s.equalIsNot("noisxxnotyynotxisi"), true);
	}

	@Test
	void testb3() {
		Compare s = new Compare();
		assertEquals(s.sumDigits("aa1bc2d3"), 6);
		assertEquals(s.sumDigits("aa11b33"), 8);
		assertEquals(s.sumDigits("Chocolate"), 0);
	}

	@Test
	void testc3() {
		Compare s = new Compare();
		assertEquals(s.maxBlock("hoopla"), 2);
		assertEquals(s.maxBlock("abbCCCddBBBxx"), 3);
		assertEquals(s.maxBlock(""), 0);
	}

	@Test
	void testd3() {
		Compare s = new Compare();
		int a[] = { 2, 1, 2, 3, 4 };
		int b[] = { 2, 2, 0 };
		int c[] = { 1, 3, 5 };
		assertEquals(s.countEvens(a), 3);
		assertEquals(s.countEvens(b), 3);
		assertEquals(s.countEvens(c), 0);
	}

	@Test
	void teste3() {
		Compare s = new Compare();
		int a[] = { 1, 2, 2, 1 };
		int b[] = { 1, 1 };
		int c[] = { 1, 2, 2, 1, 13 };
		assertEquals(s.sum13(a), 6);
		assertEquals(s.sum13(b), 2);
		assertEquals(s.sum13(c), 6);
	}

	@Test
	void testf3() {
		Compare s = new Compare();
		int a[] = { 0, 2, 4 };
		int b[] = { 1, 2, 3 };
		int c[] = { 1, 2, 4 };
		assertEquals(s.lucky13(a), true);
		assertEquals(s.lucky13(b), false);
		assertEquals(s.lucky13(c), false);
	}

	@Test
	void testg3() {
		Compare s = new Compare();
		assertArrayEquals(new int[] { 0, 1, 2, 3 }, s.fizzArray(4));
		assertArrayEquals(new int[] { 0 }, s.fizzArray(1));
		assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, s.fizzArray(10));
	}

	@Test
	void testh3() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3, 4 };
		int c[] = { 2, 3, 4 };
		assertEquals(s.no14(a), true);
		assertEquals(s.no14(b), false);
		assertEquals(s.no14(c), true);
	}

	@Test
	void testi3() {
		Compare s = new Compare();
		int a[] = { 1, 2, 3 };
		int b[] = { 2, 3, 10 };
		int a1[] = { 1, 2, 3 };
		int b1[] = { 2, 3, 5 };
		int a2[] = { 1, 2, 3 };
		int b2[] = { 2, 3, 3 };
		assertEquals(s.matchUp(a, b), 2);
		assertEquals(s.matchUp(a1, b1), 3);
		assertEquals(s.matchUp(a2, b2), 2);
	}

	@Test
	void testj3() {
		Compare s = new Compare();
		int a[] = { 2, 1, 3, 5 };
		int b[] = { 2, 1, 2, 4 };
		int c[] = { 2, 4, 2, 5 };
		assertEquals(s.no14(a), true);
		assertEquals(s.no14(b), false);
		assertEquals(s.no14(c), true);
	}

	@Test
	void testk3() {
		Compare s = new Compare();
		int a[] = { 5, 6, 45, 99, 13, 5, 6 };
		int b[] = { 5, 6, 45, 99, 13, 5, 6 };
		int c[] = { 5, 6, 45, 99, 13, 5, 6 };
		assertEquals(s.sameEnds(a, 1), false);
		assertEquals(s.sameEnds(b, 2), true);
		assertEquals(s.sameEnds(c, 3), false);
	}

	@Test
	void testl3() {
		Compare s = new Compare();
		int a[] = { 6, 2, 5, 3 };
		int b[] = { 1, 2 };
		int c[] = { 1 };
		assertArrayEquals(new int[] { 2, 5, 3, 6 }, s.shiftLeft(a));
		assertArrayEquals(new int[] { 2, 1 }, s.shiftLeft(b));
		assertArrayEquals(new int[] { 1 }, s.shiftLeft(c));
	}

	@Test
	void testm3() {
		Compare s = new Compare();
		int a[] = { 2, 4, 1, 2 };
		int b[] = { 4, 1, 4, 2 };
		int c[] = { 4, 4, 1, 2, 3 };
		assertArrayEquals(new int[] { 1, 2 }, s.post4(a));
		assertArrayEquals(new int[] { 2 }, s.post4(b));
		assertArrayEquals(new int[] { 1, 2, 3 }, s.post4(c));
	}

	@Test
	void testn3() {
		Compare s = new Compare();
		int a[] = { 1, 10, 10, 2 };
		int b[] = { 10, 2, 10 };
		int c[] = { 1, 99, 10 };
		assertArrayEquals(new int[] { 1, 2, 0, 0 }, s.withoutTen(a));
		assertArrayEquals(new int[] { 2, 0, 0 }, s.withoutTen(b));
		assertArrayEquals(new int[] { 1, 99, 0 }, s.withoutTen(c));
	}

	@Test
	void testo3() {
		Compare s = new Compare();
		int a[] = { 10, 3, 5, 6 };
		int b[] = { 7, 2, 10, 9 };
		int c[] = { 2, 10, 7, 2 };
		assertEquals(s.bigDiff(a), 7);
		assertEquals(s.bigDiff(b), 8);
		assertEquals(s.bigDiff(c), 8);
	}

	@Test
	void testp3() {
		Compare s = new Compare();
		int a[] = { 1, 2, 2 };
		int b[] = { 1, 2, 2, 6, 99, 99, 7 };
		int c[] = { 1, 1, 6, 7, 2 };
		assertEquals(s.sum67(a), 5);
		assertEquals(s.sum67(b), 5);
		assertEquals(s.sum67(c), 4);
	}

	@Test
	void testq3() {
		Compare s = new Compare();
		int a[] = { 2, 3, 2, 2, 4, 2 };
		int b[] = { 2, 3, 2, 2, 4, 2, 2 };
		int c[] = { 1, 2, 3, 4 };
		assertEquals(s.sum28(a), true);
		assertEquals(s.sum28(b), false);
		assertEquals(s.sum28(c), false);
	}

	@Test
	void testr3() {
		Compare s = new Compare();
		int a[] = { 1, 4, 1, 4 };
		int b[] = { 1, 4, 2, 4 };
		int c[] = { 1, 1 };
		assertEquals(s.only14(a), true);
		assertEquals(s.only14(b), false);
		assertEquals(s.only14(c), true);
	}

	@Test
	void tests3() {
		Compare s = new Compare();
		int a[] = { 1, 2, 1, 3 };
		int b[] = { 1, 2, 1, 3 };
		int c[] = { 1, 2, 1, 3, 4 };
		assertEquals(s.isEverywhere(a, 1), true);
		assertEquals(s.isEverywhere(b, 2), false);
		assertEquals(s.isEverywhere(c, 1), false);
	}

	@Test
	void testt3() {
		Compare s = new Compare();
		int a[] = { 1, 7, 7 };
		int b[] = { 1, 7, 1, 7 };
		int c[] = { 1, 7, 1, 1, 7 };
		assertEquals(s.has77(a), true);
		assertEquals(s.has77(b), true);
		assertEquals(s.has77(c), false);
	}

	@Test
	void testu3() {
		Compare s = new Compare();
		int a[] = { 3, 1, 3, 1, 3 };
		int b[] = { 3, 1, 3, 3 };
		int c[] = { 3, 4, 3, 3, 4 };
		assertEquals(s.haveThree(a), true);
		assertEquals(s.haveThree(b), false);
		assertEquals(s.haveThree(c), false);
	}

	@Test
	void testv3() {
		Compare s = new Compare();
		int a[] = { 1, 4, 5, 6, 2 };
		int b[] = { 1, 2, 3 };
		int c[] = { 1, 2, 4 };
		assertEquals(s.tripleUp(a), true);
		assertEquals(s.tripleUp(b), true);
		assertEquals(s.tripleUp(c), false);
	}

	@Test
	void testw3() {
		Compare s = new Compare();
		int a[] = { 2, 10, 3, 4, 20, 5 };
		int b[] = { 10, 1, 20, 2 };
		int c[] = { 10, 1, 9, 20 };
		assertArrayEquals(new int[] { 2, 10, 10, 10, 20, 20 }, s.tenRun(a));
		assertArrayEquals(new int[] { 10, 10, 20, 20 }, s.tenRun(b));
		assertArrayEquals(new int[] { 10, 10, 10, 20 }, s.tenRun(c));
	}

}
