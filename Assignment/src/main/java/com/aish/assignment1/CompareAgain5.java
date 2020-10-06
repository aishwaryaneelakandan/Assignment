package com.aish.assignment1;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CompareAgain5 {
	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}
		map.put("bread", "butter");
		return map;
	}

	public Map<String, String> mapAB2(Map<String, String> map) {
		if (map.containsKey("a") && (map.containsKey("b"))) {
			if (map.get("a").equals(map.get("b"))) {
				map.remove("a");
				map.remove("b");
			}
		}
		return map;
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		map.remove("c");
		return map;
	}

	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}
		return map;
	}

	public Map<String, String> mapAB3(Map<String, String> map) {
		if (map.containsKey("a") && !(map.containsKey("b"))) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("b") && !(map.containsKey("a"))) {
			map.put("a", map.get("b"));
		}
		return map;
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}

	public Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		return map;
	}

	public Map<String, String> mapAB4(Map<String, String> map) {
		if (map.containsKey("a") && (map.containsKey("b"))) {
			if (map.get("a").length() > map.get("b").length()) {
				map.put("c", map.get("a"));
			}
			if (map.get("a").length() < map.get("b").length()) {
				map.put("c", map.get("b"));
			}
			if (map.get("a").length() == map.get("b").length()) {
				map.put("a", "");
				map.put("b", "");
			}
		}
		return map;
	}

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Arrays.sort(strings);
		for (int i = 0; i < strings.length - 1; i++) {
			if (!strings[i].equals(strings[i + 1])) {
				map.put(strings[i], 0);
				map.put(strings[i + 1], 0);
			}
		}
		if (strings.length > 0) {
			map.put(strings[0], 0);
		}
		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				int count = map.get(s);
				map.put(s, count + 1);
			}
		}
		return map;
	}

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (String s : strings) {
			if (!map.containsKey(s)) {
				map.put(s, false);
			} else {
				map.put(s, true);
			}
		}
		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			map.put(s, s.length());
		}
		return map;
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		String firstChar = "";
		String value = "";
		for (String s : strings) {
			firstChar = s.substring(0, 1);
			if (!map.containsKey(firstChar)) {
				map.put(firstChar, s);
			} else {
				value = map.get(firstChar) + s;
				map.put(firstChar, value);
			}
		}
		return map;
	}

	public String[] allSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String firstChar = "";
		for (int i = 0; i < strings.length; i++) {
			firstChar = strings[i].substring(0, 1);
			if (!map.containsKey(firstChar)) {
				map.put(firstChar, i);
			} else if (map.containsKey(firstChar) && map.get(firstChar) != strings.length) {
				String temp = strings[map.get(firstChar)];
				strings[map.get(firstChar)] = strings[i];
				strings[i] = temp;
				map.put(firstChar, strings.length);
			} else {
				map.put(firstChar, i);
			}
		}
		return strings;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (String s : strings) {
			map.put(s.substring(0, 1), s.substring(s.length() - 1, s.length()));
		}
		return map;
	}

	public String wordAppend(String[] strings) {
		int count = 0;
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				count = map.get(s);
				map.put(s, count + 1);
			}
			if (map.get(s) % 2 == 0) {
				result += s;
			}
		}
		return result;
	}

	public String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String firstChar = "";
		for (int i = 0; i < strings.length; i++) {
			firstChar = strings[i].substring(0, 1);
			if (map.containsKey(firstChar) && !map.containsKey(firstChar + "*")) {
				String temp = strings[map.get(firstChar)];
				strings[map.get(firstChar)] = strings[i];
				strings[i] = temp;
				map.put(firstChar + "*", i);
			} else {
				map.put(firstChar, i);
			}
		}
		return strings;
	}

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	public List<String> copies3(List<String> strings) {
		strings.replaceAll(n -> n + n + n);
		return strings;
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
		return nums;
	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(n -> n * n);
		return nums;
	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}

	public List<String> lower(List<String> strings) {
		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		return strings;
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(n -> (1 + n) * 10);
		return nums;
	}

	public List<String> noX(List<String> strings) {
		strings.replaceAll(n -> n.replace("x", ""));
		return strings;
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(n -> n.contains("z"));
		return strings;
	}

	public List<String> noYY(List<String> strings) {
		return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
	}
}
