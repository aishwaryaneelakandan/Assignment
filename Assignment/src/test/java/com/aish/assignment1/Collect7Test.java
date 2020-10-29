package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class Collect7Test {

	@Test
	void Associate() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		s10.associate(map1);
		assertEquals(map1.get(1), "Red");
		assertEquals(map1.get(2), "Green");
		assertEquals(map1.get(3), "Black");
		assertEquals(map1.get(4), "White");
		assertEquals(map1.get(5), "Blue");
	}

	@Test
	void Size() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		assertEquals(s10.size(map1), 5);
	}

	@Test
	void Copy() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(1, "Red");
		map3.put(2, "Green");
		map3.put(3, "Black");
		map3.put(4, "White");
		map3.put(5, "Blue");
		map3.put(6, "Orange");
		assertEquals(s10.copy(map1, map2), map3);
	}

	@Test
	void RemoveAll() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		HashMap<Integer, String> map2 = new HashMap<>();
		assertEquals(s10.removeall(map1), map2);
	}

	@Test
	void IsEmptyOrNot() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		assertEquals(s10.isemptyornot(map1), map2);
	}

	@Test
	void Clone() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Red");
		map2.put(2, "Green");
		map2.put(3, "Black");
		map2.put(4, "White");
		map2.put(5, "Blue");
		assertEquals(s10.clone(map1), map2);
	}

	@Test
	void SpecifiedKey() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		Integer a = 1;
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		assertTrue(s10.specifiedkey(map1, a));
	}

	@Test
	void SpecifiedValue() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		String a = "Black";
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		assertTrue(s10.specifiedvalue(map1, a));
	}

	@Test
	void GetKey() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		int a = 3;
		assertEquals(s10.getkey(map1, a), map1.put(3, "Black"));
	}

	@Test
	void SetValue() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
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
		assertEquals(s10.setvalue(map1), map2);
	}

	@Test
	void SetView() {
		Collect7 s10 = new Collect7();
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		s10.setview(map1);
		assertEquals(map1.get(1), "Red");
		assertEquals(map1.get(2), "Green");
		assertEquals(map1.get(3), "Black");
		assertEquals(map1.get(4), "White");
		assertEquals(map1.get(5), "Blue");
	}
}
