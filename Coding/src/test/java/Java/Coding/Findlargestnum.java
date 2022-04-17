package Java.Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class Findlargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//second largest number in an arrray
		int[] num = {5,3,5,3,6,48,47,2,6,8,819,47,500};
		Arrays.sort(num);
		int temp = 0;
		
		int size = num.length;
		for (int i =size-1; i>=0; i--)
		{
		if((num[i-1])<num[i])
		{
	System.out.println(num[i-1]);
	break;
		}
		}
		
	}

}
