package Java.Coding;

public class ciscointerviewques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4 12 8
		//5 5 4
		//5 6 19
		int[][] a = {{2,12,8},{67,5,4},{5,6,19}};
		int min = a[0][0];
		int max = 0;
		int temp =0;
		for(int i =0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					max = j;
				}
				if(a[i][max] > temp)
				{
					temp = a[i][max];
				}
			}
		}
		System.out.println("min number is " +min);
		System.out.println("column number is " +max);
		System.out.println("max row is " +temp);
	}
	
}
