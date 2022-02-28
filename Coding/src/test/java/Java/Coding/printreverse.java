package Java.Coding;

public class printreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "ARUSH";
		
		for(int i =name.length()-1; i>=0; i--)
		{
			System.out.print(name.charAt(i));
			
		}
		
		StringBuilder s = new StringBuilder(name);
	System.out.println(s.reverse().toString());
		
	}

}
