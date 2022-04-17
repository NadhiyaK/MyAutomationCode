package Java.Coding;

import java.util.ArrayList;

public class uniquenumberinmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[3][3];
		a[0][0] = 4;
		a[0][1] = 73;
		a[0][2] = 73;
		a[1][0] = 73;
		a[1][1] = 73;
		a[1][2] = 73;
		a[2][0] = 58;
		a[2][1] = 73;
		a[2][2] = 73;
		int min = a[0][0];
		int col = 0;
		int max = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				if(!al.contains(a[i][j]))
				{
					al.add(a[i][j]);
				}
			}
			}
		System.out.println(al);
	}


	}

