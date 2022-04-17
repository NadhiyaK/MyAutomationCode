package Java.Coding;

public class Signal implements TrafficSignal, continent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("testing" +a);
		
		Signal s = new Signal();
		s.greengo();
		s.flashingyellow();
		s.redstop();
		//name = "Arush";
		System.out.println(name);
		s.secondinterface();
		
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implemented");
	}

	@Override
	public void flashingyellow() {
		// TODO Auto-generated method stub
		System.out.println("flashingyellow implemented");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implemented");
	}

	@Override
	public void secondinterface() {
		// TODO Auto-generated method stub
		System.out.println("secondinterface implemented");
	}

}
