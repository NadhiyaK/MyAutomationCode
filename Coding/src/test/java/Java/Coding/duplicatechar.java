package Java.Coding;

import java.util.ArrayList;

public class duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 char[] ch = {'e', 'a', 'i', 'i', 'u','r','e'};
	 ArrayList<String> cha = new ArrayList<String>();
	 String first = String.valueOf(ch[0]);
	 cha.add(first);
	 System.out.println(first);
	for(int i = 1; i < ch.length; i++)
	{
	String second = String.valueOf(ch[i]);
	if(first!=second)
	{
		if(!cha.contains(second))
		{
		cha.add(second);
		System.out.println(second);
		}
		
	}
	
	
	}
	 
	
	 
	 
	}

}
