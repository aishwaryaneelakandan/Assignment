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

}