package NCAA.ncaa;

import java.util.ArrayList;

public class multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] mul = {5,3,5,2,4,2,5,2,4};
		for(int i:mul)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		
		String name = "Ayush and Ayush are very good boys";
	String[] names	= name.split(" ");
	ArrayList<String> n = new ArrayList<String>();
	for( int i = 0; i<names.length; i++)
	{
		if(!n.contains(names[i]))
		{
			n.add(names[i]);
		}
		
	}
	for(int g=names.length-1; g>=0; g--)
	{
		System.out.println(names[g]);
	}
	System.out.println(n);
	
	String ma = "Boolean";
	for(int i = ma.length()-1; i>=0; i--)
	{
		System.out.println(ma.charAt(i));
	}
	}
}
