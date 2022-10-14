package StringPrograms;

public class FindMaxlengthwithNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"234567","5674","321 "," 47","64126"};//ab
		String maxlength=s[0];//6
	    for(int i=0;i<s.length;i++)
	   {
		if(s[i].length()>maxlength.length())//6<6 4<6t
		{
			maxlength=s[i];//minlength=ab
		}
	}
	   for(int i=0;i<s.length;i++)
	    {
		if(s[i].length()==maxlength.length())
		{
			System.out.println(s[i]);//ab
		}
	}

}






	}


