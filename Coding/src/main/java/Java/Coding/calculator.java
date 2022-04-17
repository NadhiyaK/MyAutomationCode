package Java.Coding;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String s;
		
		
		System.out.println("Welcome to Calculator app");
		System.out.println("-------------------------");
		System.out.println("Select the performance you want to make");
		System.out.println("---------------------------------------");
		System.out.println("A is for Addition ");
		System.out.println("S is for Subtraction ");
		System.out.println("M is for Multiplication ");
		System.out.println("D is for Division ");
		System.out.println("Enter your input:  " );
		s = scan.next();
		System.out.println("Enter your first number: ");

		int number1 = scan.nextInt();
		System.out.println("Enter your second number: ");

		int number2 = scan.nextInt();
		
		
		if(s.equalsIgnoreCase("A") || s.equalsIgnoreCase("a"))
		{
			calculator.addition(number1, number2);
		}
		if(s.equalsIgnoreCase("S") || s.equalsIgnoreCase("s"))
		{
			calculator.Subtraction(number1, number2);
		}
		if(s.equalsIgnoreCase("M") || s.equalsIgnoreCase("m"))
		{
			calculator.Multiplication(number1, number2);
		}
		if(s.equalsIgnoreCase("D") || s.equalsIgnoreCase("d"))
		{
			calculator.Division(number1, number2);
		}
		System.out.println("---------------------------------------");
	}
	
	public static void addition(int number1, int number2)
	{
		int result = number1 + number2;
		System.out.println("Sum of "+number1+ " and "+number2+ " is "+result);
		
	}
	public static void Subtraction(int number1, int number2)
	{
		int result = number1 - number2;
		System.out.println("Subtraction of "+number1+ " and "+number2+ " is "+result);
		
	}
	public static void Multiplication(int number1, int number2)
	{
		int result = number1 * number2;
		System.out.println("Multiplication of "+number1+ " and "+number2+ " is "+result);
		
	}
	public static void Division(int number1, int number2)
	{
		int result = number1 / number2;
		System.out.println("Division of "+number1+ " and "+number2+ " is "+result);
		
	}
}
