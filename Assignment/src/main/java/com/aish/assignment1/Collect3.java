package com.aish.assignment1;
import java.util.LinkedList;
import java.util.Collections;
public class Collect3 {
public LinkedList<String> elementsposition(LinkedList<String> list){
	for(int p=0; p < list.size(); p++) {
		list.get(p);
	}
	return list;
}
public LinkedList<String> remove(LinkedList<String> list){
	LinkedList<String> listOne=new LinkedList<String>();
	listOne.addAll(list);
	listOne.remove();
	return listOne;
}
public LinkedList<String> removefirstlast(LinkedList<String> list){
	LinkedList<String> listOne=new LinkedList<String>();
	listOne.addAll(list);
	listOne.removeFirst();
	listOne.removeLast();
	return listOne;
}
public LinkedList<String> removeall(LinkedList<String> list){
	LinkedList<String> listOne=new LinkedList<String>();
	listOne.addAll(list);
	listOne.removeAll(list);
	return listOne;
}
public LinkedList<String> swap(LinkedList<String> list){
	Collections.swap(list, 1, 2);
	return list;
}

}
