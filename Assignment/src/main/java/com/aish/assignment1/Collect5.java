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

	public TreeSet<String> clone(TreeSet<String> t1) {
		TreeSet<String> t2 = new TreeSet<String>();
		t2.addAll(t1);
		t2.clone();
		return t2;
	}

	public int size(TreeSet<String> t1) {
		int t2 = 0;
		t2 = t1.size();
		return t2;
	}

	public boolean compare(TreeSet<String> t1, TreeSet<String> t2) {
		if (t1.containsAll(t2))
			return true;
		else
			return false;
	}

	public Integer returnfirst(TreeSet<Integer> t1) {
		int a = t1.pollFirst();
		return a;
	}

	public Integer returnlast(TreeSet<Integer> t1) {
		int a = t1.pollLast();
		return a;
	}

	public TreeSet<String> firstlast(TreeSet<String> t1) {
		TreeSet<String> t2 = new TreeSet<String>();
		t2.add(t1.first());
		t2.add(t1.last());
		return t2;
	}

	public TreeSet<Integer> lessthan7(TreeSet<Integer> t1) {
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(t1.lower(7));
		t2.addAll(t1);
		return t2;
	}

	public TreeSet<Integer> graterthanorequal(TreeSet<Integer> t1) {
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(t1.ceiling(10));
		return t2;
	}

	public TreeSet<Integer> lessthanorequal(TreeSet<Integer> t1) {
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(t1.floor(10));
		return t2;
	}

	public TreeSet<Integer> graterthan(TreeSet<Integer> t1) {
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(t1.higher(10));
		return t2;
	}

	public TreeSet<Integer> lowerthan(TreeSet<Integer> t1) {
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(t1.lower(10));
		return t2;
	}

	public TreeSet<Integer> remove(TreeSet<Integer> t1, Integer a) {
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.addAll(t1);
		t2.remove(a);
		return t2;
	}
}
