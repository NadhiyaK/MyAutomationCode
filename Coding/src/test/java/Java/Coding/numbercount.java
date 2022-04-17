package Java.Coding;

import java.util.ArrayList;
import java.util.HashMap;

public class numbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {4,5,3,5,6,3,5,6,3,4,6,4,3,4};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<=num.length-1; i++)
		{
		for(int j = 1; j<num.length-1; j++)
		{
			if(num[i]==num[j])
			{
				hm.put(j, num[j]);
			}
		}
		}
		
	}

}
