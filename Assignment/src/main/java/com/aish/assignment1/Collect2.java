package com.aish.assignment1;

import java.util.LinkedList;
import java.util.Iterator;

public class Collect2 {
	public LinkedList<String> append(LinkedList<String> listOne, LinkedList<String> listTwo) {
		LinkedList<String> list = new LinkedList<String>();
		list.addAll(listOne);
		list.addAll(listTwo);
		return list;
	}

	public Object iterateall(LinkedList<Integer> list) {
		for (Iterator<Integer> i = list.iterator(); i.hasNext();)
			return i.next();
		return list;
	}

	public Object iteratestarting(LinkedList<String> list) {
		Iterator<String> p = list.listIterator(1);
		while (p.hasNext())
			return p.next();
		return list;
	}

	public Object iteratereverse(LinkedList<String> list) {
		Iterator<String> it = list.descendingIterator();
		while (it.hasNext())
			return it.next();
		return list;
	}

	public LinkedList<String> insertspecified(LinkedList<String> islist, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add(0, a1);
		listOne.addAll(islist);
		return listOne;
	}

	public LinkedList<String> insertfirstlast(LinkedList<String> fllist, String a1, String a2) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addFirst(a1);
		listOne.addLast(a2);
		listOne.addAll(fllist);
		return listOne;
	}

	public LinkedList<String> insertfirst(LinkedList<String> flist, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addFirst(a1);
		listOne.addAll(flist);
		return listOne;
	}

	public LinkedList<String> insertLast(LinkedList<String> llist, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addLast(a1);
		listOne.addAll(llist);
		return listOne;
	}

	public LinkedList<String> insertelementsspecified(LinkedList<String> eslist, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add(2, a1);
		listOne.add(2, a1);
		listOne.addAll(eslist);
		return listOne;
	}

	public LinkedList<String> getfirstlast(LinkedList<String> gfllist, String a1) {
		gfllist.getFirst();
		gfllist.getLast();
		return gfllist;
	}
}
