package SDET;

public class Add2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,5,2};
		int b[] = {1,4,3,2,2};
		int c[];
		if(a.length>=b.length)
		{
			c = new int[a.length];
			for(int i=0;i<a.length-1;i++)
			{
				if(i<b.length)
				{
					c[i]=a[i]+b[i];
				}
				else
				{
					c[i]=a[i];
					
				}
			}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+"");
		}
			
		}
		
		

	}

}
