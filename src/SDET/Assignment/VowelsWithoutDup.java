package SDET.Assignment;

import java.util.LinkedHashSet;

public class VowelsWithoutDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="inda";
		char[] ch=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i< ch.length;i++)
		{
			set.add(ch[i]);
			
		}
          int count=0;
          for(Character s:set)
          {
        	  if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' )
        	  {
        		  count++;
        		  System.out.print(s);
        	  }
          }
          System.out.println(" = "+count);
          
	}

}
