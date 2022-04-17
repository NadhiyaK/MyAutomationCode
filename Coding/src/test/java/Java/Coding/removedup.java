package Java.Coding;

import java.util.ArrayList;

public class removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {2,4,5,3,54,2,4,5};
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		for(int i:num)
		{
			if(!number.contains(i))
				number.add(i);
					
		}
		System.out.println(number);
		
		String name = "mAM";
		StringBuilder b = new StringBuilder(name);
		String rev = b.reverse().toString();
	//System.out.println(rev);
		
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("It is palindrom");
		}
		else
		{
			System.out.println("It is not a palindrom");
		}
		
		String name1 = "Arush";
		String nam = "";
		for(int i = name1.length()-1; i>=0; i--)
		{
			nam = nam+name1.charAt(i);
			//System.out.println(name1.charAt(i));
		}
		System.out.println(nam);
		
	}

}
