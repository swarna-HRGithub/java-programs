package SDET.Assignment;

import java.util.Arrays;

public class UniqueArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,1,1,5,4};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i]+" ");
				
			}
		}
		System.out.println(a[a.length-1]);
         
	}

}
