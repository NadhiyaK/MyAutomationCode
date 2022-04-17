package Java.Coding;

public class minnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {5,3,5,4,2,5,2,5,2,6,3,5};
		int temp = 0;
		for(int i = 0; i<num.length; i++)
		{
			
			for(int j = i+1; j<num.length; j++)
			{
				if(num[j]>num[i])
				{
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
			System.out.println(num[i]);
		}
		
	/*	
		int min = num[0];
		for( int i : num)
		{
			if(i<min)
			{
				min = i;
			}
		}
		System.out.println("Minimum number is " +min);
		
	/*	for(int i =0; i<num.length-1; i++)
		{
			if(num[i]<min)
			{
				min = num[i];
			}
		}
		System.out.println("Minimum number is " +min); */
	}

}
