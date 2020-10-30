package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class Collect8Test {

	@Test
	void Associate() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		s11.associate(map1);
		assertEquals(map1.get(1), "Red");
		assertEquals(map1.get(2), "Green");
		assertEquals(map1.get(3), "Black");
		assertEquals(map1.get(4), "White");
		assertEquals(map1.get(5), "Blue");
	}
	@Test
	void Copy() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		TreeMap<Integer,String> map2=new TreeMap<Integer,String>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		TreeMap<Integer,String> map3=new TreeMap<Integer,String>();
		map3.put(1, "Red");
		map3.put(2, "Green");
		map3.put(3, "Black");
		map3.put(4, "White");
		map3.put(5, "Blue");
		map3.put(6, "Orange");
		assertEquals(s11.copy(map1, map2), map3);
	}
	@Test
	void SearchKey() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		Integer a=3;
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		assertTrue(s11.searchkey(map1, a));
	}
	@Test
	void SearchValue() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		String a="Blue";
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		assertTrue(s11.searchvalue(map1, a));
	}
	@Test
	void GetKeys() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		Set<Integer> map2 = new HashSet<>();
		map2.add(1);
		map2.add(2);
		map2.add(3);
		map2.add(4);
		map2.add(5);
		assertEquals(s11.getkeys(map1), map2);
	}
	@Test
	void Delete() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		TreeMap<Integer,String> map2=new TreeMap<Integer,String>();
		assertEquals(s11.delete(map1), map2);
}
	@Test
	void GetKeyValue() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		s11.getkeyvalue(map1);
		assertEquals(map1.get(1),"Red");
		assertEquals(map1.get(4),"White");
}
	@Test
	void GreaterOrLesser() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(10, "Red");
		map1.put(20, "Green");
		map1.put(30, "Black");
		map1.put(40, "White");
		s11.greaterorlesser(map1);
		assertEquals(map1.get(10),"Red");
}
	@Test
	void StrictlyLess() {
		Collect8 s11=new Collect8();
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Red");
		map1.put(20, "Green");
		map1.put(30, "Black");
		map1.put(40, "White");
		s11.strictlyless(map1);
		assertEquals(map1.get(1),"Red");
}
	
}
