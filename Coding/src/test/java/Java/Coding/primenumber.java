package Java.Coding;

public class primenumber {

	//prime number validatioin
	public static String Isprime(int num) {
		//if 0 and 1 its not a prime
		
		if(num<=1)
		{
			return "Is not a prime number";
		}
		for(int i=2; i<num; i++)
		{
			if(num % i ==0)
			{
				
				return "Is not a prime number";
			}
		}
		return "Is a prime number";
	}
	//check how many prime numbers below lets say 20
	//int num=20
	public static void getprimenumber(int num)
	{
		for(int i = 0; i<=num; i++)
		{
			if(primenumber.Isprime(i)=="Is a prime number")
			{
				System.out.println(i + " " );
			}
		
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primenumber.getprimenumber(30);
		
		
		
	}

}
