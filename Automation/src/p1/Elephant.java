package p1;

public class Elephant implements Animal{

	@Override
	public void Run() {
		System.out.println("Elephant running");
		
	}

	@Override
	public void Move() {
		System.out.println("Elephant moving");
		
	}

	@Override
	public void sleep() {
		System.out.println("Elephant sleeping");
		
	}
	
	public void nothunt() {
		System.out.println("Elephant is not hunting type ");
	}
	
	

}
