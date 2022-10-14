package SDET;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(10);
		set.add("Hello");
		set.add("null");
		set.add("null");
		set.add(30);
		
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));
		
		System.out.println(set.size());
		if(set.contains("Hello")) {
			System.out.println("present");

	}
		else {
			System.out.println("not present");
		}
		for(Object obj:set) //using for each loop fetching data
		{
			System.out.println();
			
			Iterator<Object> i=set.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}

}
}
