package Java.Coding;
import java.util.Arrays;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[5];
		
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 2;
		arr[3] = 17;
		arr[4] = 19;
		
		for(int i = 0; i<=arr.length-1; i++)
		{
			//System.out.println(arr[i]);
			
		}
		
		int[] arr2 = {1,4,6,3,2,6,21,64,74};
		
		for(int i =arr2.length-1; i>=0; i--)
		{
			System.out.println(arr2[i]);
		}
		
		String[] names = {"ayush","arush","aju","nadhi"};
		for(String n: names)
		{
			if(n.equalsIgnoreCase("Arush"))
			System.out.println(n);
			
		}
		//sorting the array
		int[] arr3 = {1,4,4,3,1,3,5,4,4};
		
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=i+1; j<arr3.length; j++)
			{
				int temp = 0;
				if(arr3[j]<arr3[i])
				{
					temp = arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
				}
				
			}
			System.out.println(arr3[i] + " ");
		}
		
		
		int[] w = {4,5,2,4,6,2,4,6};
		Arrays.sort(w);
		System.out.println(Arrays.toString(w));
		
	
	}
	
	String[] names = {"Ayush","Arush","Aju","nadhi"};
	StringBuilder bbb = new StringBuilder();
	

	

}
