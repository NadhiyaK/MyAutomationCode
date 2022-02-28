package Java.Coding;

import java.util.ArrayList;

public class printuniquenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {3,5,2,5,3,5,3,5,3,5,3,5};
	
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		
		for(int i =0; i<num.length; i++)
		{
			int count = 0;
			if(!num1.contains(num[i]))
			{
				num1.add(num[i]);
				count++;
			
			
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]==num[j])
				{
					count = count+1;
				}
				
			}
			System.out.println(num[i] + " " + count);
			}
			
		}
	int[] fina = new int[num1.size()];
	for(int i = 0; i<num1.size(); i++)
	{
		fina[i] = num1.get(i);
		System.out.println(fina[i]);
	}
}
}
