package com.aish.assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

	public HashSet<String> clone(HashSet<String> set1) {
		HashSet<String> set = new HashSet<String>();
		set.addAll(set1);
		set.clone();
		return set;
	}

	public Set<String> hashtotree(HashSet<String> set1) {
		Set<String> tree_set = new TreeSet<String>(set1);
		return tree_set;
	}

	public List<String> hashtolist(HashSet<String> set1) {
		List<String> aList = new ArrayList<String>(set1);
		return aList;
	}

	public boolean compare(HashSet<String> set1, HashSet<String> set2) {
		if (set1.containsAll(set2))
			return true;
		else
			return false;
	}

	public String[] hashtoarray(HashSet<String> set1) {
		String[] array = new String[set1.size()];
		set1.toArray(array);
		return array;
	}

	public HashSet<String> retainall(HashSet<String> set1, HashSet<String> set2) {
		HashSet<String> set = new HashSet<String>();
		set.retainAll(set1);
		set.retainAll(set2);
		return set;
	}

	public int size(HashSet<String> set1) {
		int set = 0;
		set = set1.size();
		return set;
	}

	public HashSet<String> removeall(HashSet<String> set1) {
		HashSet<String> set = new HashSet<String>();
		set.addAll(set1);
		set.clear();
		return set;
	}

}
