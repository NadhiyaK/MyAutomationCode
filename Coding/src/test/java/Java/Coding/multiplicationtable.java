package Java.Coding;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that takes a number as input and prints its multiplication table upto 10
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the number: ");
				int num = sc.nextInt();
				int result = 0;
				for(int i = 0; i<=10; i++)
				{
					result = i * num;
					System.out.println(i +"*" +num+ "=" +result);
				}
	}

}
