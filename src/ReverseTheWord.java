
public class ReverseTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="I love Bangolore";//Bangolore love I
		String [] s=st.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");//remove space
		}

	}

}
