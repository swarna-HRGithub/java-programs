package StringPrograms;

import java.util.LinkedHashSet;

public class positionOfEachWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love Bangolore City";
		String[] s=str.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			
		}
		for(String stri :set)
		{
			
			for(int i=0;i<s.length;i++)
			{
				if(stri.equals(s[i]))
				{
					
				
			
			
			System.out.println(stri+" is present in " +(i+1)+" position");
			break;
		}

	}

}
}
}
