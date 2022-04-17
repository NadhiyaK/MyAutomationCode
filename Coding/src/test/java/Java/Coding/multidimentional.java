package Java.Coding;

import java.util.ArrayList;

public class multidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = new int[3][3];
		a[0][0] = 4;
		a[0][1] = 3;
		a[0][2] = 5;
		a[1][0] = 43;
		a[1][1] = 53;
		a[1][2] = 98;
		a[2][0] = 37;
		a[2][1] = 02;
		a[2][2] = 43;
		int min = a[0][0];
		int col = 0;
		int max = 0;
		//ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
			System.out.print(a[i][j]+ "\t");
			if(a[i][j]<min)
			{
				min = a[i][j];
				col = j;
			}
			
			}
			System.out.println();
		}
		for(int k=0; k<=2; k++)
		{
			if(a[k][col]>max)
			{
				max = a[k][col];
			}
		}
		System.out.println("Minimum Number is: "+min);
		System.out.println("column number is: "+col);
		System.out.println("Maximum number in "+col+" column is "+max);
	}

}
