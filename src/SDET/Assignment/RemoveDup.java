package SDET.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,4,1,1,5,4};
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		for(int n:hs)
		{
			System.out.println(n+ " ");
			
		}
		
	}
}

			


