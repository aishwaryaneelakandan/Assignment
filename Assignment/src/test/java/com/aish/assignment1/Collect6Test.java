package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.jupiter.api.Test;

class Collect6Test {
	@Test
	void Removeall() {
		Collect6 s9 = new Collect6();
		PriorityQueue<String> t1 = new PriorityQueue<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Black");
		t1.add("White");
		assertTrue(s9.removeall(t1));
	}

	@Test
	void Count() {
		Collect6 s9 = new Collect6();
		PriorityQueue<String> t1 = new PriorityQueue<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Black");
		t1.add("White");
		assertEquals(s9.count(t1), 4);
	}

	@Test
	void Compare() {
		Collect6 s9 = new Collect6();
		PriorityQueue<String> t1 = new PriorityQueue<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Black");
		t1.add("White");
		PriorityQueue<String> t2 = new PriorityQueue<String>();
		t2.add("Red");
		t2.add("Green");
		t2.add("Black");
		t2.add("White");
		assertTrue(s9.compare(t1, t2));
	}

	@Test
	void RetriveFirst() {
		Collect6 s9 = new Collect6();
		PriorityQueue<String> t1 = new PriorityQueue<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Black");
		t1.add("White");
		String a1 = "Black";
		assertEquals(s9.retrivefirst(t1), a1);
	}

	@Test
	void RetriveFirstRemove() {
		Collect6 s9 = new Collect6();
		PriorityQueue<String> t1 = new PriorityQueue<String>();
		t1.add("Red");
		t1.add("Green");
		t1.add("Black");
		t1.add("White");
		String a1 = "Black";
		assertEquals(s9.removefirstretrive(t1), a1);
	}

	@Test
	void QueueToArray() {
		Collect6 s9 = new Collect6();
		PriorityQueue<String> set1 = new PriorityQueue<String>();
		set1.add("Red");
		set1.add("Green");
		set1.add("Black");
		set1.add("White");
		List<String> t1 = Arrays.asList("Black", "Red", "Green", "White");
		assertEquals(s9.queuetoarray(set1), t1);
	}

}
