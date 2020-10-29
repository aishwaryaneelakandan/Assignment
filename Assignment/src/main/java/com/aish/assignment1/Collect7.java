package com.aish.assignment1;

import java.util.HashMap;
import java.util.Map;

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

}
