package Java.Coding;

public class palidromnumber {

	
//	public static String palindromcheck(String num) {
//		
//		StringBuilder sb = new StringBuilder(num);
//		
//		String rev = sb.reverse().toString();
//		return rev;
//		
//		
//		
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 15351;
		String rev = "";
	
		String num = Integer.toString(n);
		
		//System.out.println(num);
		int size = num.length();
		
		for(int i = size-1; i>=0; i--)
		{
			char s = num.charAt(i);
			rev = rev+s;
			
			
		}
		System.out.println(rev + " is a reversed string");
//		if(palidromnumber.palindromcheck(num).equalsIgnoreCase(num))
//		{
//			System.out.println(n + " is a palindrom number");
//			
//		}
//		else
//		{
//			System.out.println(n + " is not a palindrom");
//		}
		
		if(num.equalsIgnoreCase(rev)) {
		
			System.out.println(n + " is a palindrom number");
			
		}
		else
		{
			System.out.println(n + " is not a palindrom");
		}
	}

}
