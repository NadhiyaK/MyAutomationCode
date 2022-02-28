package Java.Coding;

import java.util.Scanner;

public class palindromcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value");
		System.out.println();
				String name = scan.next();
				scan.close();
				
		StringBuilder s = new StringBuilder(name);
		String name1 = s.reverse().toString();
		
		if(name.equalsIgnoreCase(name1))
		{
			
			System.out.println("YEs they are palindrom");
			
		}
		else
		{
			System.out.println("No they are not");
		}
		
		
	}

}
