package SDET;

import java.util.Scanner;

public class NoDivby5And3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("HiHello");
			
		}
		else if(n%3==0) {
			System.out.println("Hello");
		
		}
	    else if(n%5==0) {
	    	System.out.println("Hi");

	}
	    else {
	    	System.out.println("bye");
	    }

}
}
   