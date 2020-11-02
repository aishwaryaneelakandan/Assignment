package com.aish.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Collect6 {
	public boolean removeall(PriorityQueue<String> t1) {
		t1.removeAll(t1);
		if (t1.size() == 0)
			return true;
		else
			return false;
	}

	public int count(PriorityQueue<String> t1) {
		int t2 = 0;
		t2 = t1.size();
		return t2;
	}

	public boolean compare(PriorityQueue<String> t1, PriorityQueue<String> t2) {
		if (t1.containsAll(t2))
			return true;
		else
			return false;
	}

	public String retrivefirst(PriorityQueue<String> t1) {
		String x = t1.peek();
		return x;
	}

	public String removefirstretrive(PriorityQueue<String> t1) {
		String x = t1.poll();
		return x;
	}

	public List<String> queuetoarray(PriorityQueue<String> t1) {
		List<String> array_list = new ArrayList<String>(t1);
		return array_list;
	}

	public boolean display(PriorityQueue<String> t1, PriorityQueue<String> t2) {
		if (t2.addAll(t1))
			return true;
		else
			return false;
	}

	public boolean iterate(PriorityQueue<String> t1, PriorityQueue<String> t2) {
		if (t2.addAll(t1))
			return true;
		else
			return false;
	}

	public boolean insert(PriorityQueue<String> t1, PriorityQueue<String> t2, String a1) {
		if (t2.offer(a1))
			return true;
		else
			return true;
	}

	public List<String> queuetostring(PriorityQueue<String> t1) {
		List<String> array_list = new ArrayList<String>(t1);
		return array_list;
	}

	public boolean addall(PriorityQueue<String> t1, PriorityQueue<String> t2) {
		if (t2.addAll(t1))
			return true;
		else
			return false;
	}

	public boolean maximumpriority(PriorityQueue<String> t1, PriorityQueue<String> t2) {
		if (t2.addAll(t1))
			return true;
		else
			return false;
	}
}
