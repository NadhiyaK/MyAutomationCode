package Java.Coding;

public class inheritance2 extends inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		inheritance2 ih = new inheritance2();
		ih.method1ininher1();
		String name = "AyuAru";
		inheritance2.method1ininher2(name);
		
	
		
	}
	

	public static String method1ininher2(String name)
	{
		System.out.println("This is method 1 in inheritance 2");
		System.out.println(name);
		return "testing";
	}

	}
