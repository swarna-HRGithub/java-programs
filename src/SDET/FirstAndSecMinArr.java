package SDET;

public class FirstAndSecMinArr {
	public static void main(String[] args) 
	{
		int Arr[]= {2,3,9,5,1};
		int FirstMinNum=Arr[0];
		int SecondMinNum=Arr[0];
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]<=FirstMinNum) {
				if(Arr[i]!=FirstMinNum) {
					SecondMinNum=FirstMinNum;
					
				}
				FirstMinNum=Arr[i];
			}
				
				else if(FirstMinNum==SecondMinNum || Arr[i]<SecondMinNum) {
					SecondMinNum=Arr[i];
					
				}
			}
				
			
	 
		
		
			
		System.out.println("First Min Value:" +FirstMinNum);
		System.out.println("Second Min Value:" +SecondMinNum);
		
		
}
}



