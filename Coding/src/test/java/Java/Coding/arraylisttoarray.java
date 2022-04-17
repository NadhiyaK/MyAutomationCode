package Java.Coding;

import java.util.ArrayList;

public class arraylisttoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {4,5,3,5,2,4,2,5,6,3,5};
		
		ArrayList<Integer> sor = new ArrayList<Integer>();
		
		for(int i: num)
		{
			if(!sor.contains(i))
			{
				sor.add(i);
			}
		}
	System.out.println(sor);
	int[] sorted = new int[sor.size()];
	System.out.println(sor.size());
	for(int i = 0; i<sor.size(); i++)
	{
		
		sorted[i] = sor.get(i);
	}
		for(int t : sorted)
		{
			System.out.println(t);
		}
	}

}
