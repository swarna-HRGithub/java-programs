package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

import SDET.HashMap1;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
			//i=0,0<6T
			//i=1,1<6T
			//i=2,2<6T
			//i=3,3<6T
			//i=4,4<6T
			//i=0,5<6T
			//i=0,6<6terminate
			
		//{
		//	System.out.println(s.charAt(i));
		//}

	//}
	{
		set.add(s.charAt(i));
		System.out.println(set);
		
	}
	for(Character ch:set) {
		System.out.print(ch);
	}

}
}
