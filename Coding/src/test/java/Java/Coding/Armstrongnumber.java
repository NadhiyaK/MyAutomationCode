package Java.Coding;

public class Armstrongnumber {

	
	
	public static void armstrong(int num) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(num<=100)
		{
			System.out.println("Please enter greater than 100");
		}
		else
			
		a = num%10;
		b=num/10;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//153 then 
		//1*1*1
		//5*5*5
		//3*3*3 and total should be 153
		
		armstrong(153);
		
		
	}

}
