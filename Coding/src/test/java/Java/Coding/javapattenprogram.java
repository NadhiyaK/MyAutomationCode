package Java.Coding;

public class javapattenprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to display the following pattern. Go to the editor
//		Sample Pattern :
//
//		   J    a   v     v  a                                                  
//		   J   a a   v   v  a a                                                 
//		J  J  aaaaa   V V  aaaaa     
		
		
		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a ");
		System.out.println("J  J  aaaaa   V V  aaaaa ");
		
		//Write a Java program to compute the specified expressions and print the output.
		double num = 25.5;
		double num1 = 3.5;
		double num2 = 40.5;
		double num3 = 4.5;
		
		double result = ((num*num1-num1*num1)/(num2-num3));
		System.out.println(result);
		//How to swap two numbers without using a third variable
		int n1 = 4;
		int n2 = 5;
		System.out.println("Values of n1 and n2 before swaping: " + n1 +" " + n2);
		n2 = n2 + n1; 
		n1 = n2 - n1;
		n2 = n2 - n1;
		
		System.out.println("Values of n1 and n2 after swaping: " + n1 +" " + n2);
		
	}

}
