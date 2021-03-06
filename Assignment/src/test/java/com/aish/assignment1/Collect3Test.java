package com.aish.assignment1;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
	@Test
	void Shuffle() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Green");
		list1.add("Red");
		assertEquals(s6.shuffle(list),list1);
		
	}
	@Test
	void Join() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add( "Yellow");
		list1.add( "Orange");
		list1.add( "Purple");
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Blue");
		list2.add("Yellow");
		list2.add("Orange");
		list2.add("Purple");
		assertEquals(s6.join(list, list1),list2);
	}
	@Test
	void Clone() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Blue");
		assertEquals(s6.clone(list),list1);
	}
@Test
	void Isempty() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		LinkedList<String> list1=new LinkedList<String>();
		assertEquals(s6.isempty(list),list1);
	}
	@Test
	void Replace() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		String a="White";
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Red");
		list1.add("White");
		list1.add("Blue");
		assertEquals(s6.replace(list, a),list1);
	}
	@Test
	void Linkedlisttoarraylist() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		List<String> list1 = Arrays.asList("Red","Green","Blue");
		assertEquals(s6.linkedlisttoarraylist(list)
				,list1);
	}
	@Test
	void ComapreLinkedlist() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Blue");
		assertTrue(s6.comparelinkedlist(list, list1));
	}
@Test
	void Contains() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		String a="Blue";
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		assertTrue(s6.elementexists(list, a));
	}
	@Test
	void Retrivefirst() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		String a1="Red";
		assertEquals(s6.retrivefirst(list),a1);
	}
	@Test
	void Retrivelast() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		String a1="Blue";
		assertEquals(s6.retrivelast(list),a1);
	}
	@Test
	void Returnfirst() {
		Collect3 s6=new Collect3();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		String a1="Red";
		assertEquals(s6.returnfirst(list),a1);
	}
	
	
}
