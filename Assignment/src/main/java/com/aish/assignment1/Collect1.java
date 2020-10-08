package com.aish.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collect1 {
	public List<String> merge() {
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

		listOne.addAll(listTwo);

		return listOne;
	}

	public List<String> compare() {
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

		listOne.equals(listTwo);

		return listOne;
	}

	public List<Integer> clear() {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		arr1.clear();
		return arr1;
	}

	public List<Integer> empty1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.isEmpty();
		list.add(1);
		list.isEmpty();
		list.clear();
		list.isEmpty();
		return list;
	}

	public List<Integer> reverseArrayList() {
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		for (int i = 0; i < lista.size(); i++) {
			lista.add(i, lista.remove(lista.size() - 1));
		}
		return lista;
	}

	public List<Integer> sortArrayList() {
		ArrayList<Integer> slist = new ArrayList<Integer>();
		slist.add(10010);
		slist.add(5);
		slist.add(4);
		slist.add(2);
		for (int i = 0; i < slist.size(); i++) {
			for (int j = slist.size() - 1; j > i; j--) {
				if (slist.get(i) > slist.get(j)) {
					int tmp = slist.get(i);
					slist.set(i, slist.get(j));
					slist.set(j, tmp);
				}
			}
		}
		return slist;
	}

	public List<Integer> searchArrayList() {
		ArrayList<Integer> s1list = new ArrayList<Integer>();
		s1list.add(90);
		s1list.add(80);
		s1list.add(70);
		s1list.add(60);
		s1list.add(50);
		s1list.add(40);
		s1list.add(30);
		s1list.add(20);
		s1list.get(1);
		s1list.get(3);
		s1list.get(5);
		return s1list;
	}

	public List<String> insertFirstArrayList() {
		ArrayList<String> iflist = new ArrayList<String>();
		iflist.add("Red");
		iflist.add("Green");
		iflist.add("Orange");
		iflist.add("White");
		iflist.add("Black");
		iflist.add(0, "Violet");
		return iflist;
	}

	public List<String> updateArrayList() {
		ArrayList<String> ulist = new ArrayList<String>();
		ulist.add("Red");
		ulist.add("Green");
		ulist.add("Orange");
		ulist.add("White");
		ulist.add("Black");
		ulist.set(3, "Pink");
		return ulist;
	}

	public List<String> secondelementArrayList() {
		ArrayList<String> selist = new ArrayList<String>();
		selist.add("Red");
		selist.add("Green");
		String new_color = "White";
		selist.set(1, new_color);
		int num = selist.size();
		for (int i = 0; i < num; i++) {
			selist.get(i);
		}
		return selist;
	}
}
