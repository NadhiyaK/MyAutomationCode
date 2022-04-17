package Java.Coding;

import java.util.ArrayList;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {5,4,5,4,3,5,3};
		
		ArrayList<Integer> dup = new ArrayList<Integer>();
		
		for(int i = 0; i<num.length; i++)
		{
			if(!dup.contains(num[i]))
			{
				dup.add(num[i]);
			}
		}
		System.out.println(dup);
	}

}
