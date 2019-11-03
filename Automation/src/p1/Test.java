package p1;

public class Test {

	public static void main(String[] args) {
		
		Powercar obj = new Powercar();
		obj.name= "B";
		obj.capacity= 1234;
		
		System.out.println(obj.name);
		System.out.println(obj.capacity);
		
		Powercar obj1= new Powercar("Honda city", 200);
		System.out.println(obj1.name);
		System.out.println(obj1.capacity);
		
		
	}

}
