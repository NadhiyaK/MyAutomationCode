package Java.Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class findrepeatingnumcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {4,5,2,5,6,2,4,6,7,3,6,2,4};
		ArrayList<Integer> sort = new ArrayList<Integer>();
		int count = 0;
		int first =0;
		for(int i = 0; i<num.length; i++)
		{
			if(!sort.contains(num[i]))
			{
				sort.add(num[i]);
			}
		}
		System.out.println(sort);
		for(int i = 0; i<sort.size(); i++)
		{
			first = sort.get(i);
			count = 0;
			for(int j = 0; j<num.length; j++)
			{
				if(first==num[j])
				{
					count++;
				}
			}
			System.out.println("count of "+first+ " is "+count);
			if(count==1)
			{
				System.out.println(first+" is unique number");
			}
		}
	
	}
}
