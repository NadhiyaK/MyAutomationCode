package Java.Coding;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {4,5,2,5,6,3,6,2,4,6,2,4,63,5};
		//int temp =0;
	//	int first = 0;
	//	int second = 0;
		for(int i =0; i<num.length; i++)
		{
			for(int j = i+1; j<num.length; j++)
			{
				int temp=0;
				if(num[j]<num[i])
				{	
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
					
				}
				
			}
			System.out.println(num[i]);
		}
		//sorting method
		Arrays.sort(num);
		for(int i =0; i<num.length; i++)
		{
		System.out.println(num[i]);
		}
		
	}

}
