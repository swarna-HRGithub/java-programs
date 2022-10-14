package StringPrograms;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="I love Banglore City";
		//int a=10;
		//int b=20;
		//int temp=a;
		//a=b;
		//b=temp;
		//System.out.println(a);	
		//System.out.println(b);
		
		//logic:2
		String[]s=st.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
		
		
		
		
		

	}

}
