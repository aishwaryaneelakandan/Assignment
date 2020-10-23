package com.aish.assignment1;

import java.util.Iterator;
import java.util.TreeSet;

public class Collect5 {
	public TreeSet<String> add(TreeSet<String> t1) {
		return t1;
	}

	public TreeSet<String> iterate(TreeSet<String> t1) {
		for (Iterator<String> i = t1.iterator(); i.hasNext();)
			i.next();
		return t1;
	}

	public TreeSet<String> addall(TreeSet<String> t1, TreeSet<String> t2) {
		t1.addAll(t2);
		return t1;
	}

	public TreeSet<Object> reverse(TreeSet<Object> t1) {
		TreeSet<Object> res = (TreeSet<Object>) t1.descendingSet();
		return res;
	}

	
}
