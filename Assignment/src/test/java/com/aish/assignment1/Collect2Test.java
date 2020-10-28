package com.aish.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class Collect2Test {
	@Test
	void testMerge() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		String a = "Mango";
		list.add("Apple");
		list.add("Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Mango");
		assertEquals(s5.append(list, a), list1);
	}

	@Test
	void testIterateall() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Mango");
		assertTrue(list1.equals(list1));
	}

	@Test
	void testInsertspecified() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		String a = "Mango";
		list.add("Apple");
		list.add("Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Orange");
		assertEquals(s5.insertspecified(list, a), list1);
	}

	@Test
	void testInsertfirstlast() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		String a = "Mango";
		String b = "Pineapple";
		list.add("Apple");
		list.add("Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Pineapple");
		assertEquals(s5.insertfirstlast(list, a, b), list1);
	}

	@Test
	void testInsertfirst() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		String a = "Mango";
		list.add("Apple");
		list.add("Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Orange");
		assertEquals(s5.insertfirst(list, a), list1);
	}

	@Test
	void testInsertlast() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		String a = "Mango";
		list.add(0, "Apple");
		list.add(1, "Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Mango");
		assertEquals(s5.insertlast(list, a), list1);
	}

	@Test
	void testInsertelementsspecified() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		String a = "Mango";
		String b = "Pineapple";
		list.add("Apple");
		list.add("Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Mango");
		list1.add("Pineapple");
		list1.add("Apple");
		list1.add("Orange");
		assertEquals(s5.insertelementsspecified(list, a, b), list1);
	}

	@Test
	void testGetfirstlast() {
		Collect2 s5 = new Collect2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Mango");
		list1.add("Orange");
		assertEquals(s5.getfirstlast(list), list1);
	}
}
