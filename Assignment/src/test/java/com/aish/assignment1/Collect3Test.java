package com.aish.assignment1;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Collect3Test {

	@Test
	void Elementsposition() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add(0, "Red");
		list1.add(1, "Green");
		list1.add(2, "Blue");
		assertEquals(s6.elementsposition(list),list1);
	}
	@Test
	void Remove() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Green");
		list1.add("Blue");
		assertEquals(s6.remove(list),list1);
	}
	@Test
	void RemoveFirstLast() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Green");
		assertEquals(s6.removefirstlast(list),list1);
	}
	@Test
	void RemoveAll() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		assertEquals(s6.removeall(list),list1);
	}
	@Test
	void Swap() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		assertEquals(s6.swap(list),list1);
	}
}