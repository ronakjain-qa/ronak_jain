package p1;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.Move();
		a.Run();
		a.sleep();
		
		Animal a1= new Elephant();
		a1.Move();
		a1.Run();
		a1.sleep();
		a1 = new Cat();
		a1.Move();
		
	}

}
