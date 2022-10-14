package StringPrograms;

public class FindMinLenghStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"abcdef","avbp","qfq "," ab","ewree"};//ab
			String minlength=s[0];//6
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<minlength.length())//6<6 4<6t//for max length ">"
			{
				minlength=s[i];//minlength=ab
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==minlength.length())
			{
				System.out.println(s[i]);//ab
			}
		}

	}

}
