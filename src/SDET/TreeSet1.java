package SDET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
 

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(6);
		set.add(9);
		System.out.println(set);
		ArrayList<Object> list=new ArrayList<Object>(set);
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add(50);
		System.out.println(set);
		System.out.println(list.get(4));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(list.remove(3));
		System.out.println(list.set(3," hi hello"));
		System.out.println(set.descendingSet());
		System.out.println();
		Iterator<Object> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
		
		

	}

}
