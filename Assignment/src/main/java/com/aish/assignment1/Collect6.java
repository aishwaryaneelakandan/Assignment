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

}
