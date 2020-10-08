package com.aish.assignment1;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Compare1Test {
	@Test
	void testMerge() {
		Collect1 s4=new Collect1();
	
		List<String> list1 = Arrays.asList("a","b","c","d","f","a","b","c","d","e");
		assertEquals(s4.merge(),list1);
	}
		
	@Test
	void testCompare() {
		List<String> list1 = Arrays.asList("a","b","c","d","e");
		List<String> list2 = Arrays.asList("a","b","c","d","e");
		assertTrue(list1.equals(list2));
	}
		@Test
		void testClear() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList();
			assertEquals(s4.clear(),list1);
		}
		@Test
		void testEmpty() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList();
			assertEquals(s4.empty1(),list1);
		}
		@Test
		void testReverse() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(5,4,3,2,1);
			assertEquals(s4.reverseArrayList(),list1);
		}
		
		@Test
		void testSort() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(2,4,5,10010);
			assertEquals(s4.sortArrayList(),list1);
}
		@Test
		void testSearch() {
			Collect1 s4=new Collect1();
			List<Integer> list1 = Arrays.asList(90,80,70,60,50,40,30,20);
			assertEquals(s4.searchArrayList(),list1);
}
		@Test
		void testInsertFirst() {
			Collect1 s4=new Collect1();
			List<String> list1 = Arrays.asList("Violet","Red","Green","Orange","White","Black");
			assertEquals(s4.insertFirstArrayList(),list1);
}	
		@Test
		void testUpdate() {
			Collect1 s4=new Collect1();
			List<String> list1 = Arrays.asList("Red","Green","Orange","Pink","Black");
			assertEquals(s4.updateArrayList(),list1);
}
		@Test
		void testSecondElement() {
			Collect1 s4=new Collect1();
			List<String> list1 = Arrays.asList("Red","White");
			assertEquals(s4.secondelementArrayList(),list1);
}
}
