package com.aish.assignment1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Collect4Test {

	@Test
	void Append() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		String a = "Green";
		set1.add("Red");
		set1.add("Blue");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Red");
		set2.add("Blue");
		set2.add("Green");
		assertEquals(s7.append(set1, a), set2);
	}

	@Test
	void Iterate() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Red");
		set2.add("Blue");
		set2.add("Green");
		assertEquals(s7.iterate(set1), set2);
	}

	@Test
	void Empty() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		HashSet<String> set2 = new HashSet<String>();
		assertEquals(s7.empty(set1), set2);
	}

	@Test
	void isEmpty() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		assertEquals(s7.isemptynot(set1), set2);
	}
	@Test
	void Clone() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Red");
		set2.add("Blue");
		set2.add("Green");
		assertEquals(s7.clone(set1), set2);
	}
	@Test
	void HashToTree() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Red");
		set2.add("Blue");
		set2.add("Green");
		assertEquals(s7.hashtotree(set1), set2);
	}

	@Test
	void HashToList() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		List<String> list1 = Arrays.asList("Red", "Blue", "Green");
		assertEquals(s7.hashtolist(set1), list1);
	}

	@Test
	void Compare() {
		Collect4 s7 = new Collect4();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Red");
		set2.add("Blue");
		set2.add("Green");
		assertTrue(s7.compare(set1, set2));
	}
}
