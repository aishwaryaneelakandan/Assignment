package com.aish.assignment1;

import java.util.HashSet;
import java.util.Iterator;


public class Collect4 {
	public HashSet<String> append(HashSet<String> set1, String set2) {
		HashSet<String> set = new HashSet<String>();
		set.addAll(set1);
		set.add(set2);
		return set;
	}

	public HashSet<String> iterate(HashSet<String> set1) {
		for (Iterator<String> i = set1.iterator(); i.hasNext();)
			i.next();
		return set1;
	}

	public HashSet<String> empty(HashSet<String> set1) {
		HashSet<String> set = new HashSet<String>();
		set.addAll(set1);
		set.removeAll(set);
		return set;
	}

	public HashSet<String> isemptynot(HashSet<String> set1) {
		HashSet<String> set = new HashSet<String>();
		set.addAll(set1);
		set.isEmpty();
		return set;
	}

}
