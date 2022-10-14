package SDET.Assignment;

import java.util.LinkedHashSet;

public class OccurenceOfEachNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		for(Integer stri :set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(stri.equals(a[i]))
				{
					count++;
				}
			}
			System.out.println(stri+" = is repeating "+count+" time");
		}
		
		

	}




	}


