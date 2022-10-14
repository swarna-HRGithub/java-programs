package StringPrograms;

public class ReverseGivenWord {

	public static void main(String[] args) {
		String st="I love Bangolore city";
		String[] str=st.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String s=str[i];
			for(int j=s.length()-1;j>=0;j--)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}


	}

}
