package Oops.oops;

public class childclassabstract extends parentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclassabstract p = new childclassabstract();
		p.engine();
		p.body();
		p.color();
		childclassabstract c = new childclassabstract();
		c.engine1();
		
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}
	public void engine1()
	{
		System.out.println("this is child class engine");
	}

}
