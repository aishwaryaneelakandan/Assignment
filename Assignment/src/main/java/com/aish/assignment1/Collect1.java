package com.aish.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collect1 {
	public List<String> merge(List<String> listOne,List<String> listTwo) {
		List<String> listThree=new ArrayList<String>();
        listThree.addAll(listOne);
        listThree.addAll(listTwo);
        return listThree;
	}

	public List<String> compare(List<String> listOne,List<String> listTwo) {
		listOne.equals(listTwo);
		return listOne;
	}

	public List<Integer> clear1(List<Integer> arr1) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.addAll(arr1);
		list1.clear();
		return list1;
	}

	public boolean empty1(List<Integer> list) {
		if(list.isEmpty())
			return true;
		else
			return false;
	}

	public List<Integer> reverseArrayList(List<Integer> lista) {
		 List<Integer> revArrayList = new ArrayList<Integer>(); 
	        for (int i = lista.size() - 1; i >= 0; i--) {
	            revArrayList.add(lista.get(i)); 
	        }
	        return revArrayList; 
	    } 
	 
	

	public List<Integer> sortArrayList(List<Integer> slist) {
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

	public List<Integer> searchArrayList(List<Integer> s1list,int n) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		list1.addAll(s1list);
		list1.get(n);
		list2.add(list1.get(n));
		return list2;
	}

	public List<String> insertFirstArrayList(List<String> iflist,String a1) {
		List<String> listOne=new ArrayList<String>();
		listOne.add(0, a1);
		listOne.addAll(iflist);
		return listOne;
	}

	public List<String> updateArrayList(List<String> ulist,String a1) {
		List<String> listOne=new ArrayList<String>();
		listOne.addAll(ulist);
		listOne.set(2, a1);
		return listOne;
	}

	public List<String> secondelementArrayList(List<String> selist,String a1) {
		List<String> listTwo=new ArrayList<String>();
		listTwo.addAll(selist);
		listTwo.set(1, a1);
		return selist;
	}
}
