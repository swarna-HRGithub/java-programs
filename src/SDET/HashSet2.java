package SDET;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {		
	     HashSet<Object> set=new HashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add(20);
		set.add("hello");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));		
		System.out.println(set.size());
		if(set.contains("hi")) {
			System.out.println("present");
			
		}
		else {
			System.out.println("not present");
			
		}
		for(Object obj :set)//using for each loop fetching data
		
		{
			System.out.println();
		}
		Iterator<Object> i=set.iterator();//using iterator fetching data
		while(i.hasNext()) {
			System.out.println(i.next());
		


		
		
		
		
		
		
		

	}


	
		
	}

}
