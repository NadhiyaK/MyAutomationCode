package Java.Coding;

import java.util.Scanner;

public class Workday extends workdaymain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;
	//	initializedriver();
		result = workdaymain.calculator(2, 5, "multiply");
		System.out.println(result);
		
		String name = "MAdDAsM";
		String revname = "";
		StringBuffer sb = new StringBuffer(name);
		String rev = sb.reverse().toString();
		System.out.println(rev);
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("They are palindrom");
		}
		else
		{
			System.out.println("They are not palindrom");
		}
		
		for(int i =name.length()-1; i>=0; i--)
		{
			revname += name.charAt(i);
		}
		System.out.println(revname + "is the reverse string");
		
		
	}

	

}
