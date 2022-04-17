package Java.Coding;

public class trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "     a b c d e f g";
		String trimname = name.replaceAll(" ", "");
		System.out.println(trimname);
		
		String name1 = "      d dg e r ";
		String trime = name1.trim();
		System.out.println(trime);
	}
	

}
