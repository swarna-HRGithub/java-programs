package SDET;

public class Swap2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int temp;
		System.out.println("before swap: value is = "+a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap:value is = "+a+"  "+b);

	}

}
