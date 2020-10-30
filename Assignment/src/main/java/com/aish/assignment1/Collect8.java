package com.aish.assignment1;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Collect8 {
	public TreeMap<Integer, String> associate(TreeMap<Integer, String> tree) {
		for (Map.Entry<Integer, String> entry : tree.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		return tree;
	}

	public TreeMap<Integer, String> copy(TreeMap<Integer, String> tree, TreeMap<Integer, String> tree1) {
		tree1.putAll(tree);
		return tree1;
	}

	public boolean searchkey(TreeMap<Integer, String> tree, Integer a) {
		if (tree.containsKey(a))
			return true;
		else
			return false;
	}

	public boolean searchvalue(TreeMap<Integer, String> tree, String a) {
		if (tree.containsValue(a))
			return true;
		else
			return false;
	}

	public Set<Integer> getkeys(TreeMap<Integer, String> tree) {
		Set<Integer> keyset = tree.keySet();
		return keyset;
	}

	public TreeMap<Integer, String> delete(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.putAll(tree);
		tree1.clear();
		return tree1;
	}

	public TreeMap<Integer, String> getkeyvalue(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.firstEntry();
		tree1.putAll(tree);
		tree1.lastEntry();
		return tree1;
	}

	public TreeMap<Integer, String> gethighestlowestkey(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.firstKey();
		tree1.putAll(tree);
		tree1.lastKey();
		return tree1;
	}

	public TreeMap<Integer, String> greaterorlesser(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.floorEntry(10);
		return tree1;
	}

	public TreeMap<Integer, String> strictlyless(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.headMap(20);
		return tree1;
	}

	public TreeMap<Integer, String> inclusivetrue(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.headMap(50, true);
		return tree1;
	}

	public TreeMap<Integer, String> leastkeygreaterthanorequal(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.ceilingEntry(20);
		return tree1;
	}

	public TreeMap<Integer, String> removeleastkey(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.pollFirstEntry();
		return tree1;
	}

	public TreeMap<Integer, String> removegreatestkey(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.pollLastEntry();
		return tree1;
	}

	public SortedMap<Integer, String> inclusiveexclusive(TreeMap<Integer, String> tree) {
		SortedMap<Integer, String> sub_tree_map = new TreeMap<Integer, String>();
		sub_tree_map = tree.subMap(20, 40);
		return sub_tree_map;
	}

	public SortedMap<Integer, String> getportion(TreeMap<Integer, String> tree) {
		SortedMap<Integer, String> sub_tree_map = new TreeMap<Integer, String>();
		sub_tree_map = tree.subMap(20, true, 40, true);
		return sub_tree_map;
	}

	public TreeMap<Integer, String> greaterthanequalto(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.tailMap(20);
		return tree1;
	}

	public TreeMap<Integer, String> greaterthan(TreeMap<Integer, String> tree) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.tailMap(20, false);
		return tree1;
	}
}
