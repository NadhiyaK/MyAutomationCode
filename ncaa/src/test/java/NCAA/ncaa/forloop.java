package NCAA.ncaa;

import java.util.ArrayList;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 3;
		arr[4] = 7;
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		int[] arr1 = {5,2,5,2,5,2,6,3,4};
		int i = 0;
		for(int ar:arr1)
		{
			
			System.out.println(arr1[i]);
			i++;
		}
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int j = 0; j<arr1.length; j++)
		{
			if(!ar.contains(arr1[j]))
			{
				ar.add(arr1[j]);
			}
		}
		System.out.println(ar);
		
		char[] c = {'t','t','e','w','t','w','p'};
		ArrayList<Character> ac = new ArrayList<Character>();
		for(int p = 0; p<c.length; p++)
		{
			if(!ac.contains(c[p]))
			{
				ac.add(c[p]);
			}
		}
		System.out.println(ac);
		
		String[] names = {"Rahul","baby","Ayush","Arush","Ayush","Arush","Rahul","Baby"};
		ArrayList<String> namelist = new ArrayList<String>();
		ArrayList<String> namelist1 = new ArrayList<String>();
		for(int l = 0; l<names.length; l++)
		{
			if(!namelist.contains(names[l]))
			{
				namelist.add(names[l]);
			}
		}
		//System.out.println(namelist);
		for(String s:namelist)
		{
			System.out.println(s);
		}
		for(int r = 0; r<names.length; r++)
		{
			namelist1.add(names[r]);
		}
		System.out.println(namelist1);
	}

}
