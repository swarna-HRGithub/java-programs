package StringPrograms;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;//5*4*3*2*1=120
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of "+n+" "+fact);
		

	}

}
