package StringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="window";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
				
        if(rev.equals(s))
        {
        	System.out.println("it is  palindrome");
        }
        else
        {
        	System.out.println("it is not palindrome");
        }
	}

}
