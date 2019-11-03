package p1;

public class Constructors {

	public static void main(String[] args) {
		Car a= new  Car();
	//	Car b= new Car();
		Car c = new Car();
		
		a.Model="BMW";
		a.price=12455;
		
		System.out.println(a.Model);
		Car d = new Car("honda", 1258888);
			
		System.out.println(d.Model);
		System.out.println(d.price);

	}

}
