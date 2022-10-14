  package SDET;

public class SwapWithoutVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10;
    int b=20;
    System.out.println("Before swaping values are..," +a+"   "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swaping values are..," +a+"   "+b);
	}

}
