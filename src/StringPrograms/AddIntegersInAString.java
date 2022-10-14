package StringPrograms;

public class AddIntegersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="b2c3d1";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9' )
			{
				sum=sum+(s.charAt(i)-'0' );
			}
		}
         System.out.println(sum);
         
	}

}
