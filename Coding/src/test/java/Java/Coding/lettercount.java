package Java.Coding;

import java.util.ArrayList;

public class lettercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = {'r','y','r','y','c','f','b'};
		
		ArrayList<Character> sor = new ArrayList<Character>();
		
		for(char i:c)
		{
			if(!sor.contains(i))
			{
				sor.add(i);
			}
		}
		System.out.println(sor);
		char first;
		int cou;
		for(int i = 0; i<sor.size();i++)
		{
			first = sor.get(i);
			cou = 0;
			for(int j = 0; j<c.length; j++)
			{
				if(first==c[j])
				{
					cou++;
				}
			}
			System.out.println("count of "+first+ " is "+cou);
		}
		
	}

}
