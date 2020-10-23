package com.aish.assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class Collect5Test {

	@Test
	void Add() {
		Collect5 s8 = new Collect5();
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Blue");
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("Red");
		t2.add("Green");
		t2.add("Blue");
		assertEquals(s8.add(t1), t2);
	}

	@Test
	void Iterate() {
		Collect5 s8 = new Collect5();
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Blue");
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("Red");
		t2.add("Green");
		t2.add("Blue");
		assertEquals(s8.iterate(t1), t2);
	}

	@Test
	void AddAll() {
		Collect5 s8 = new Collect5();
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Blue");
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("Black");
		t2.add("Orange");
		t2.add("Violet");
		TreeSet<String> t3 = new TreeSet<String>();
		t3.add("Red");
		t3.add("Green");
		t3.add("Blue");
		t3.add("Black");
		t3.add("Orange");
		t3.add("Violet");
		assertEquals(s8.addall(t1, t3), t3);
	}

	@Test
	void Reverse() {
		Collect5 s8 = new Collect5();
		TreeSet<Object> t1 = new TreeSet<Object>();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		TreeSet<Object> t2 = new TreeSet<Object>();
		t2.add(30);
		t2.add(20);
		t2.add(10);
		assertEquals(s8.reverse(t1), t2);
	}
	@Test
	void Clone() {
		Collect5 s8 = new Collect5();
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Blue");
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("Red");
		t2.add("Green");
		t2.add("Blue");
		assertEquals(s8.clone(t1), t2);
	}

	@Test
	void Size() {
		Collect5 s8 = new Collect5();
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		assertEquals(s8.size(set1), 3);
	}

	@Test
	void Comapre() {
		Collect5 s8 = new Collect5();
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Blue");
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("Red");
		t2.add("Green");
		t2.add("Blue");
		assertTrue(s8.compare(t1, t2));
	}

	@Test
	void Returnfirst() {
		Collect5 s8 = new Collect5();
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		int a1 = 10;
		assertEquals(s8.returnfirst(t1), a1);
	}

	@Test
	void Returnlast() {
		Collect5 s8 = new Collect5();
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		int a1 = 30;
		assertEquals(s8.returnlast(t1), a1);
	}
	
}
