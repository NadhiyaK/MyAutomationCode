package Java.Coding;

import java.util.ArrayList;

public class lettercountinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "AYUSHARUSH";
		
		ArrayList<Character> nam = new ArrayList<Character>();
		
		for(int i = 0; i<name.length();i++)
		{
			if(!nam.contains(name.charAt(i)))
					{
				nam.add(name.charAt(i));
					}
		}
		System.out.println(nam);
		char temp;
		for(int k = 0; k<nam.size(); k++)
		{
			temp = nam.get(k);
			int count =0;
			for(int p = 0; p<name.length(); p++)
			{
				if(temp==name.charAt(p))
					count++;
			}
			System.out.println("count of " +temp+ " is "+count);
		}
	}

}
