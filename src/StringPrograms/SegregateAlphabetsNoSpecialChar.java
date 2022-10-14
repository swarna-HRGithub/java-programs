package StringPrograms;

public class SegregateAlphabetsNoSpecialChar {

	public static void main(String[] args) {
		
		String s="a$@1sv%2";
		char[] ch=s.toCharArray();
		String alpha=" ";
		String num=" ";
		String spe=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' &&s.charAt(i)>='Z' || s.charAt(i)>='a' && s.charAt(i)>='z' ) 
			{
			  alpha=alpha+s.charAt(i);
			} 
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
		}
			else
			{
				spe=spe+s.charAt(i);
				
			}
		}
			System.out.println(alpha+num+spe);
		}
}
		  
		
		


		

	







