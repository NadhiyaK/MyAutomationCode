package Java.Coding;

public class fibanocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//series 0 1 1 2 3 5 8 13 21 34
		int first = 0;
		int second = 1;
		int result = 0;
		System.out.println(first);
		System.out.println(second);
		for (int i =0; i<8; i++)
		{
			result = first + second;
			first=second;
			second=result;
			System.out.println(result);
		}
		
	}

}
