package com.aish.assignment1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collect8 {
	public TreeMap<Integer,String> associate(TreeMap<Integer,String> tree){
		for (Map.Entry<Integer,String> entry : tree.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		return tree;
	}
	public TreeMap<Integer,String> copy(TreeMap<Integer,String> tree,TreeMap<Integer,String> tree1){
		tree1.putAll(tree);
		return tree1;
	}
	public boolean searchkey(TreeMap<Integer,String> tree,Integer a){
		if (tree.containsKey(a))
			return true;
		else
			return false;
	}
	public boolean searchvalue(TreeMap<Integer,String> tree,String a){
		if (tree.containsValue(a))
			return true;
		else
			return false;
	}
	public Set<Integer> getkeys(TreeMap<Integer,String> tree){
		Set<Integer> keyset = tree.keySet();
		return keyset;
	}
	public TreeMap<Integer,String> delete(TreeMap<Integer,String> tree){
		TreeMap<Integer,String> tree1=new TreeMap<Integer,String>();
		tree1.putAll(tree);
		tree1.clear();
		return tree1;
	}
	public TreeMap<Integer,String> getkeyvalue(TreeMap<Integer,String> tree){
		TreeMap<Integer,String> tree1=new TreeMap<Integer,String>();
		tree1.firstEntry();
		tree1.putAll(tree);
		tree1.lastEntry();
		return tree1;
}
	public TreeMap<Integer,String> gethighestlowestkey(TreeMap<Integer,String> tree){
		TreeMap<Integer,String> tree1=new TreeMap<Integer,String>();
		tree1.firstKey();
		tree1.putAll(tree);
		tree1.lastKey();
		return tree1;
}
	
	public TreeMap<Integer,String> greaterorlesser(TreeMap<Integer,String> tree){
		TreeMap<Integer,String> tree1=new TreeMap<Integer,String>();
		tree1.floorEntry(10);
		return tree1;
}
	public TreeMap<Integer,String> strictlyless(TreeMap<Integer,String> tree){
		TreeMap<Integer,String> tree1=new TreeMap<Integer,String>();
		tree1.headMap(20);
		return tree1;
}
	
}
