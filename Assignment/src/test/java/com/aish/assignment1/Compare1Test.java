package com.aish.assignment1;
import java.util.List;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Compare1Test {
	@Test
	void testMerge() {
		Collect1 s4=new Collect1();
		List<String> list1 = Arrays.asList("a","b","c","d","f");
	    List<String> list2 = Arrays.asList("a","b","c","d","f");
	    List<String> list3 = Arrays.asList("a","b","c","d","f","a","b","c","d","f");
	    assertEquals(s4.merge(list1, list2),list3);
	}
		
	@Test
	void testCompare() {
		Collect1 s4=new Collect1();
		List<String> list1 = Arrays.asList("a","b","c","d","e");
		List<String> list2 = Arrays.asList("a","b","c","d","e");
		assertTrue(s4.compare(list1, list2));
	}
		@Test
		void testClear() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(1,2,3,4);
			List<Integer> list = Arrays.asList();
			assertEquals(s4.clear1(list1),list);
		}
		@Test
		void testEmpty() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(1);
			List<Integer> list2 = Arrays.asList();
			assertFalse(s4.empty1(list1));
			assertTrue(s4.empty1(list2));
		}
		@Test
		void testReverse() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(5,4,3,2,1);
			List<Integer> list2 = Arrays.asList(1,2,3,4,5);
			assertEquals(s4.reverseArrayList(list1),list2);
		}
		
		@Test
		void testSort() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(10010,5,4,2);
			List<Integer> list2 = Arrays.asList(2,4,5,10010);
			assertEquals(s4.sortArrayList(list1),list2);
}
		@Test
		void testSearch() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(90,80,70,60,50,40,30,20);
			int n=3;
			assertEquals(s4.searchArrayList(list1, n),Arrays.asList(60));
}
		@Test
		void testInsertFirst() {
			Collect1 s4=new Collect1();
			List<String> list1 = Arrays.asList("Red","Green","Orange","White","Black");
			String list="Violet";
			List<String> list2 = Arrays.asList("Violet","Red","Green","Orange","White","Black");
			assertEquals(s4.insertFirstArrayList(list1, list),list2);
			
}	
		@Test
		void testUpdate() {
			Collect1 s4=new Collect1();
			List<String> list1 = Arrays.asList("Red","Green","Orange","Pink","Black");
			String list="Violet";
			List<String> list2 = Arrays.asList("Red","Green","Violet","Pink","Black");
			assertEquals(s4.updateArrayList(list1,list),list2);
}
		@Test
		void testSecondElement() {
			Collect1 s4=new Collect1();
			List<String> list1 = Arrays.asList("Red","Green","Orange","Pink","Black");
			String list="Violet";
			List<String> list2 = Arrays.asList("Red","Violet","Orange","Pink","Black");
			assertEquals(s4.secondelementArrayList(list1,list),list2);
}
}
