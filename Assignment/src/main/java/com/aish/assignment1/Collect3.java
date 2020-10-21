package com.aish.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Collect3 {
	public LinkedList<String> elementsposition(LinkedList<String> list) {
		for (int p = 0; p < list.size(); p++) {
			list.get(p);
		}
		return list;
	}

	public LinkedList<String> remove(LinkedList<String> list) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list);
		listOne.remove();
		return listOne;
	}

	public LinkedList<String> removefirstlast(LinkedList<String> list) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list);
		listOne.removeFirst();
		listOne.removeLast();
		return listOne;
	}

	public LinkedList<String> removeall(LinkedList<String> list) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list);
		listOne.removeAll(list);
		return listOne;
	}

	public LinkedList<String> swap(LinkedList<String> list) {
		Collections.swap(list, 1, 2);
		return list;
	}

	public LinkedList<String> shuffle(LinkedList<String> list) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list);
		Collections.shuffle(listOne);
		return listOne;
	}

	public LinkedList<String> join(LinkedList<String> list1, LinkedList<String> list2) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list1);
		listOne.addAll(list2);
		return listOne;
	}

	public LinkedList<String> clone(LinkedList<String> list) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.clone();
		listOne.addAll(list);
		return listOne;
	}

	public LinkedList<String> isempty(LinkedList<String> list) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list);
		listOne.isEmpty();
		return listOne;
	}

	public LinkedList<String> replace(LinkedList<String> list, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(list);
		listOne.set(1, a1);
		return listOne;
	}
	public String retrivefirst(LinkedList<String> list){
		String x=list.peekFirst();
		return x;
	}
	public String retrivelast(LinkedList<String> list){
		String x=list.peekLast();
		return x;
	}
	public boolean elementexists(LinkedList<String> list,String a){
		if(list.contains(a))
			return true;
		else
			return false;
		}
	public List<String> linkedlisttoarraylist(LinkedList<String> list){
		List<String> aList = new ArrayList<String>(list);
	    return aList;
	}
	public boolean comparelinkedlist(LinkedList<String> list,LinkedList<String> list1){
		if(list.containsAll(list1))
		return true;
		else
			return false;
	}
	public String returnfirst(LinkedList<String> list){
		String a=list.pop();
		return a;
	}
}

	