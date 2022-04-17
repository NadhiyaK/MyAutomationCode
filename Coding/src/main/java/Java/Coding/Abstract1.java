package Java.Coding;

public class Abstract1 extends abstractclass{

	public static void main(String[] args) {
		
		Abstract1 a = new Abstract1();
		a.abs1();
		a.abs2();
		
		
}

	@Override
	protected void abs2() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method called in the parent class");
	}
}