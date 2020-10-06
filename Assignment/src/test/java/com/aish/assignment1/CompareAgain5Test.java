package com.aish.assignment1;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CompareAgain5Test {
@Test
	void testMapBully() {
		CompareAgain5 s3=new CompareAgain5();
		Map<String, String> mapb = new HashMap<>();
		mapb.put("a","candy");
		mapb.put("b","dirt");
		mapb.put("b", "carrot");
		mapb.put("c", "meh");
		s3.mapBully(mapb);
		assertEquals(mapb.get("a"),"");
		assertEquals(mapb.get("b"),"candy");
	    assertEquals(mapb.get("c"),"meh");
}
@Test
void testTopping1() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapt1 = new HashMap<>();
	mapt1.put("icecream", "peanut");
	mapt1.put("icecream", "cherry");
	mapt1.put("","" );
	mapt1.put("pancake", "syrup");
	s3.topping1(mapt1);
	assertEquals(mapt1.get("icecream"),"cherry");
	assertEquals(mapt1.get("bread"),"butter");
	assertEquals(mapt1.get("pancake"),"syrup");
}
@Test
void testMapAB2() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapAB2 = new HashMap<>();
	mapAB2.put("a", "aaa");
	mapAB2.put("b", "aaa");
	mapAB2.put("c", "cake");
	mapAB2.put("b","bbb" );
	mapAB2.put("c", "aaa");
	s3.topping1(mapAB2);
	assertEquals(mapAB2.get("a"),"aaa");
	assertEquals(mapAB2.get("b"),"bbb");
	assertEquals(mapAB2.get("c"),"aaa");
}
@Test
void testMapShare() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> maps = new HashMap<>();
	maps.put("a", "aaa");
	maps.put("b", "aaa");
	maps.put("c", "ccc");
	maps.put("b", "xyz");
	maps.put("c","meh" );
	maps.put("d", "hi");
	s3.mapShare(maps);
	assertEquals(maps.get("a"),"aaa");
	assertEquals(maps.get("b"),"aaa");
	assertEquals(maps.get("d"),"hi");
}
@Test
void testTopping2() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapt2 = new HashMap<>();
	mapt2.put("icecream", "cherry");
	mapt2.put("yogurt", "cherry");
	mapt2.put("spinach", "dirt");
	s3.topping2(mapt2);
	assertEquals(mapt2.get("yogurt"),"cherry");
	assertEquals(mapt2.get("spinach"),"nuts");
}
@Test
void testMapAB3() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapAB3 = new HashMap<>();
	mapAB3.put("a", "aaa");
	mapAB3.put("c", "cake");
	s3.mapAB3(mapAB3);
	assertEquals(mapAB3.get("b"),"aaa");
}
@Test
void testMapAB() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapAB = new HashMap<>();
	mapAB.put("a", "Hi");
	mapAB.put("b", "There");
	s3.mapAB(mapAB);
	assertEquals(mapAB.get("ab"),"HiThere");
}
@Test
void testTopping3() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapt3 = new HashMap<>();
	mapt3.put("potato", "ketchup");
	mapt3.put("potato", "butter");
	mapt3.put("salad", "oil");
	s3.topping3(mapt3);
	assertEquals(mapt3.get("fries"),"butter");
	assertEquals(mapt3.get("spinach"),"oil");
}
@Test
void testMapAB4() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapAB4 = new HashMap<>();
	mapAB4.put("a", "aaa");
	mapAB4.put("b", "bb");
	mapAB4.put("c", "cake");
	mapAB4.put("a", "aa");
	mapAB4.put("b", "bbb");
	s3.mapAB4(mapAB4);
	assertEquals(mapAB4.get("c"),"bbb");
	}
@Test
void testWord0() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Integer> mapW0 = new HashMap<>();
	String a1[]= {"a", "b", "a", "b"};
	String b1[]= {"a", "b", "a", "c", "b"};
	String c1[]= {"c", "b", "a"};
	mapW0.put("a", 0);
	mapW0.put("b", 0);
	mapW0.put("c", 0);
	s3.word0(a1);
	s3.word0(b1);
	s3.word0(c1);
	assertEquals(mapW0.get("a"),0);
	assertEquals(mapW0.get("b"),0);
	assertEquals(mapW0.get("c"),0);
	}
@Test
void testWordCount() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Integer> mapc = new HashMap<>();
	String a1[]= {"a", "b", "a", "c", "b"};
	String b1[]= {"c", "b", "a"};
	String c1[]= {"c", "c", "c", "c"};
	mapc.put("a", 2);
	mapc.put("b", 2);
	mapc.put("c", 2);
	mapc.put("a", 1);
	mapc.put("b", 1);
	mapc.put("c", 1);
	mapc.put("c", 4);
	s3.wordCount(a1);
	s3.wordCount(b1);
	s3.wordCount(c1);
	assertEquals(mapc.get("a"),1);
	assertEquals(mapc.get("b"),1);
	assertEquals(mapc.get("c"),4);
	}
@Test
void testWordMultiple() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Boolean> mapm = new HashMap<>();
	String a1[]= {"a", "b", "a", "c", "b"};
	String b1[]= {"c", "b", "a"};
	String c1[]= {"c", "c", "c", "c"};
	mapm.put("a", true);
	mapm.put("b", true);
	mapm.put("c", false);
	mapm.put("a", false);
	mapm.put("b", false);
	mapm.put("c", false);
	mapm.put("c", true);
	s3.wordCount(a1);
	s3.wordCount(b1);
	s3.wordCount(c1);
	assertEquals(mapm.get("a"),false);
	assertEquals(mapm.get("b"),false);
	assertEquals(mapm.get("c"),true);
	}
@Test
void testWordLen() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Integer> mapwl = new HashMap<>();
	String a1[]= {"a", "bb", "a", "bb"};
	String b1[]= {"this", "and", "that", "and"};
	String c1[]= {"code", "code", "code", "bug"};
	mapwl.put("bb", 2);
	mapwl.put("a", 1);
	mapwl.put("that", 4);
	mapwl.put("and", 3);
	mapwl.put("this", 4);
	mapwl.put("code", 4);
	mapwl.put("bug", 3);
	s3.wordLen(a1);
	s3.wordLen(b1);
	s3.wordLen(c1);
	assertEquals(mapwl.get("bb"),2);
	assertEquals(mapwl.get("a"),1);
	assertEquals(mapwl.get("that"),4);
	assertEquals(mapwl.get("and"),3);
	assertEquals(mapwl.get("this"),4);
	assertEquals(mapwl.get("code"),4);
	assertEquals(mapwl.get("bug"),3);
	}
@Test
void testFirstChar() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapfc = new HashMap<>();
	String a1[]= {"salt", "tea", "soda", "toast"};
	String b1[]= {"aa", "bb", "cc", "aAA", "cCC", "d"};
	String c1[]= {};
	mapfc.put("s", "saltsoda");
	mapfc.put("t", "teatoast");
	mapfc.put("a", "aaaAA");
	mapfc.put("b", "bb");
	mapfc.put("c", "cccCC");
	mapfc.put("d", "d");
	mapfc.put("","");
	s3.firstChar(a1);
	s3.firstChar(b1);
	s3.firstChar(c1);
	assertEquals(mapfc.get("s"),"saltsoda");
	assertEquals(mapfc.get("t"),"teatoast");
	assertEquals(mapfc.get("a"),"aaaAA");
	assertEquals(mapfc.get("b"),"bb");
	assertEquals(mapfc.get("c"),"cccCC");
	assertEquals(mapfc.get("d"),"d");
	assertEquals(mapfc.get(""),"");
	}
@Test
void testAllSwap() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Integer> mapas = new HashMap<>();
	String a1[]= {"ab", "ac"};
	String b1[]= {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
	String c1[]= {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
	mapas.put("ab", 1);
	mapas.put("ac", 0);
	mapas.put("ax", 2);
	mapas.put("bx", 3);
	mapas.put("cx", 3);
	mapas.put("cy", 2);
	mapas.put("by",1);
	mapas.put("ay", 5);
	mapas.put("aaa", 7);
	mapas.put("azz", 6);
	mapas.put("ay", 0);
	mapas.put("by", 1);
	mapas.put("ai", 5);
	mapas.put("aj", 4);
	mapas.put("bx", 7);
	mapas.put("by", 6);
	mapas.put("ax", 5);
	s3.allSwap(a1);
	s3.allSwap(b1);
	s3.allSwap(c1);
	assertEquals(mapas.get("ac"),0);
	assertEquals(mapas.get("ab"),1);
	assertEquals(mapas.get("ay"),0);
	assertEquals(mapas.get("by"),6);
	assertEquals(mapas.get("cy"),2);
	assertEquals(mapas.get("ax"),5);
	assertEquals(mapas.get("bx"),7);
	assertEquals(mapas.get("cx"),3);
	assertEquals(mapas.get("aj"),4);
	assertEquals(mapas.get("ai"),5);
	assertEquals(mapas.get("azz"),6);
	assertEquals(mapas.get("aaa"),7);
	}
@Test
void testPairs() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, String> mapp = new HashMap<>();
	String a1[]= {"code", "bug"};
	String b1[]= {"man", "moon", "main"};
	String c1[]= {"man", "moon", "good", "night"};
	mapp.put("b", "g");
	mapp.put("c", "e");
	mapp.put("m", "n");
	mapp.put("g", "d");
	mapp.put("n", "t");
	s3.firstChar(a1);
	s3.firstChar(b1);
	s3.firstChar(c1);
	assertEquals(mapp.get("b"),"g");
	assertEquals(mapp.get("c"),"e");
	assertEquals(mapp.get("m"),"n");
	assertEquals(mapp.get("g"),"d");
	assertEquals(mapp.get("n"),"t");
	}
@Test
void testWordAppend() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Integer> mapwa = new HashMap<>();
	String a1[]= {"a", "b", "a"};
	String b1[]= {"a", "b", "a", "c", "a", "d", "a"};
	String c1[]= {"a", "", "a"};
	mapwa.put("a", 0);
	mapwa.put("aa", 0);
	mapwa.put("a", 0);
	s3.wordAppend(a1);
	s3.wordAppend(b1);
	s3.wordAppend(c1);
	assertEquals(mapwa.get("a"),0);
	assertEquals(mapwa.get("aa"),0);
	}
@Test
void testFirstSwap() {
	CompareAgain5 s3=new CompareAgain5();
	Map<String, Integer> mapfs = new HashMap<>();
	String a1[]= {"ab", "ac"};
	String b1[]= {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
	String c1[]= {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
	mapfs.put("ab", 1);
	mapfs.put("ac", 0);
	mapfs.put("ax", 2);
	mapfs.put("bx", 3);
	mapfs.put("cx", 3);
	mapfs.put("cy", 2);
	mapfs.put("by",1);
	mapfs.put("ay", 5);
	mapfs.put("aaa", 7);
	mapfs.put("azz", 6);
	mapfs.put("ay", 0);
	mapfs.put("by", 1);
	mapfs.put("ai", 5);
	mapfs.put("aj", 4);
	mapfs.put("bx", 7);
	mapfs.put("by", 6);
	mapfs.put("ax", 5);
	s3.firstSwap(a1);
	s3.firstSwap(b1);
	s3.firstSwap(c1);
	assertEquals(mapfs.get("ac"),0);
	assertEquals(mapfs.get("ab"),1);
	assertEquals(mapfs.get("ay"),0);
	assertEquals(mapfs.get("by"),6);
	assertEquals(mapfs.get("cy"),2);
	assertEquals(mapfs.get("ax"),5);
	assertEquals(mapfs.get("bx"),7);
	assertEquals(mapfs.get("cx"),3);
	assertEquals(mapfs.get("aj"),4);
	assertEquals(mapfs.get("ai"),5);
	assertEquals(mapfs.get("azz"),6);
	assertEquals(mapfs.get("aaa"),7);
	}
}