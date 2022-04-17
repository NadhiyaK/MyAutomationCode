package Java.Coding;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2 dimentional array
		
		int[][] a = {{4,2,4},{5,0,4},{5,6,19}};
		int min = a[0][0];
		for(int i = 0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j] + " ");
				if(a[i][j]<min)
				{
					min = a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Minimum number is " +min);
		
		String[][] name = {{"Ayush","Arush"},{"one","two"},{"test1","test2"}};
		for(int i = 0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
		}
	}

}
