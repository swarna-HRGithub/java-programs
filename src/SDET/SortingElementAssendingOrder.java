package SDET;

public class SortingElementAssendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {8,3,4,9,1,2,77,95 };
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++) 
			{
				if(arr[i]<arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
					
				}
				
			}
		}
        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
