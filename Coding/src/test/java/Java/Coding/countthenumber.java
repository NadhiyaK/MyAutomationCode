package Java.Coding;

public class countthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,5,2,5,6,3,6,2,4,6,2,4,63,5};
		int temp;
		for(int i = 0; i<num.length; i++)
		{
			
			int first = num[i];
			for(int j = i+1; j<num.length; j++)
			{
				
				int second = num[j];
				if(second<first)
				{
				temp = second;
				second = first;
				first = temp;
				
				}
			}
			System.out.println(first);
		}
	}

}
