package com.aish.assignment1;

import java.util.LinkedList;
import java.util.Iterator;

public class Collect2 {
	public LinkedList<String> append(LinkedList<String> listOne, String listTwo) {
		LinkedList<String> list = new LinkedList<String>();
		list.addAll(listOne);
		list.addLast(listTwo);
		return list;
	}

	public LinkedList<String> iterateall(LinkedList<String> list) {
		for (Iterator<String> i = list.iterator(); i.hasNext();)
			 i.next();
		return list;
	}

	public Object iteratestarting(LinkedList<String> list) {
		@SuppressWarnings("rawtypes")
		Iterator p = list.listIterator(2);
		while (p.hasNext())
			 p.next();
		return p;
	}

	public Object iteratereverse(LinkedList<String> list) {
		@SuppressWarnings("rawtypes")
		Iterator it = list.descendingIterator();
		while (it.hasNext())
			  it.next();
		return it;
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
		listOne.addAll(fllist);
		listOne.addLast(a2);
		return listOne;
	}

	public LinkedList<String> insertfirst(LinkedList<String> flist, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addFirst(a1);
		listOne.addAll(flist);
		return listOne;
	}

	public LinkedList<String> insertlast(LinkedList<String> llist, String a1) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.addAll(llist);
		listOne.addLast(a1);
		return listOne;
	}

	public LinkedList<String> insertelementsspecified(LinkedList<String> eslist, String a1,String a2) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add(0, a1);
		listOne.add(1, a2);
		listOne.addAll(eslist);
		return listOne;
	}

	public LinkedList<String> getfirstlast(LinkedList<String> gfllist) {
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add(0, gfllist.getFirst());
		listOne.add(1, gfllist.getLast());
		return listOne;
	}
}
