package com.aish.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collect7 {
	public HashMap<Integer, String> associate(HashMap<Integer, String> map) {
		for (@SuppressWarnings("rawtypes")
		Map.Entry x : map.entrySet()) {
			x.getKey();
			x.getValue();
		}
		return map;
	}

	public Integer size(HashMap<Integer, String> map) {
		int size = map.size();
		return size;
	}

	public HashMap<Integer, String> copy(HashMap<Integer, String> map, HashMap<Integer, String> map1) {
		map1.putAll(map);
		return map1;
	}

	public HashMap<Integer, String> removeall(HashMap<Integer, String> map) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.putAll(map);
		map1.clear();
		return map1;
	}

	public HashMap<Integer, String> isemptyornot(HashMap<Integer, String> map) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.putAll(map);
		map1.isEmpty();
		return map1;
	}

	public HashMap<Integer, String> clone(HashMap<Integer, String> map) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.putAll(map);
		map1.clone();
		return map1;
	}

	public boolean specifiedkey(HashMap<Integer, String> map, Integer a) {
		if (map.containsKey(a))
			return true;
		else
			return false;
	}

	public boolean specifiedvalue(HashMap<Integer, String> map, String a) {
		if (map.containsValue(a))
			return true;
		else
			return false;
	}

	public String getkey(HashMap<Integer, String> map, int a) {
		String val = (String) map.get(a);
		return val;
	}

	public Set<Integer> setvalue(HashMap<Integer, String> map) {
		Set<Integer> keyset = map.keySet();
		return keyset;
	}

	@SuppressWarnings("rawtypes")
	public Set setview(HashMap<Integer, String> map) {
		Set map1 = map.entrySet();
		return map1;
	}
}
