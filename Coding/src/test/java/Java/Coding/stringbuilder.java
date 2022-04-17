package Java.Coding;

import java.util.ArrayList;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] names = {"Ayush","Arush","Nadhi","Aju"};
		ArrayList<String> names1 = new ArrayList<String>();
		
		for(int i =0; i<names.length; i++)
		{
		StringBuilder sb = new StringBuilder(names[i]);
		names1.add(sb.reverse().toString());
		}
		System.out.println(names1);
	

	
	//pyramid
	//1
	//2 3
	//4 5 6
	//7 8 9 10
	int k = 1;
	for(int i =1; i<=4; i++)
	{
		for(int j = 1; j<=i; j++)
		{
			System.out.print(k + " ");
			k++;
		}
		System.out.println();
	}
}
}