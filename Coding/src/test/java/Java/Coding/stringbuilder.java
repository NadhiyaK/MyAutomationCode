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
	}

}
