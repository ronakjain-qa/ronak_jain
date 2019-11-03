package p1;

public class Cat implements Animal{

	@Override
	public void Run() {
		System.out.println("Cat running");
	}

	@Override
	public void Move() {
		System.out.println("Cat moving");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeping");
		
	}
	public void hunt() {
		System.out.println("Cat hunting");
	}

}
