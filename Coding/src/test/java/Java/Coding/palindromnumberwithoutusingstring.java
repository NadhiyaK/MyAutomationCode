package Java.Coding;

public class palindromnumberwithoutusingstring {

	
	public static void palindrom(int num) {
		
		int a=0;
		int b = num;
		int sum = 0;
	
		while(num>0)
		{
			a = num%10;
			
			sum = (sum*10)+a;
			num = num/10;
		}
		if(b==sum)
		{
			System.out.println("They are palindrome");
		}
		else
		{
			System.out.println("They are not palindrome");
		}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1251;
		palindrom(num);
	//	System.out.println(palindromnumberwithoutusingstring.palindrom(num));
		
	//	if(num==palindromnumberwithoutusingstring.palindrom(num))
				{
	//		System.out.println(num + " is a palindrom number");
				}
//		else
//		{
////			System.out.println(num + " is not a palindrom number");
//		}
//		
	}

}
