package Java.Coding;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "ygsh";
		String name1 = name.toUpperCase();
		if(name.matches(".*[aeiou].*"))
		{
			System.out.println("Yes vowels are present");
		}
		else
		{
			System.out.println("No vowels are not present");
		}
	
		
	}

}
