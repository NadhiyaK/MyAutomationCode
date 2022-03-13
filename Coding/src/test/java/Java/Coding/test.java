package Java.Coding;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[] num = {3,5,3,5,4,3,5};

		
		ArrayList<Integer> names = new ArrayList<Integer>();

		for(int i = 0; i< num.length; i++)

		{

		if(!names.contains(num[i]))
		{
		names.add(num[i]);
		}

		}
		System.out.println(names);
	}

}
