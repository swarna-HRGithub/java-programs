package SDET.Assignment;

import java.util.LinkedHashSet;

public class PrintPositionOfEacHNoWithoutDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" " ); 
		}
		for(int n:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
					System.out.println(n+" "+(i+1));
					break;
				}
			}
		}
        
	}

}
