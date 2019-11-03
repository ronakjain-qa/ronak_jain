package p1;

public class Car {
	String Model;
	int price;
   static int wheels=4;
   
   public Car() {
	   System.out.println("in constructor- no argu");
   }
	
   public Car(String Model, int price) {
	 this.Model=Model;
	 this.price=price;
	   
   }
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.Model="Maruti";
		c1.price= 500000;
		//c1.wheels=4;
		
		Car c2 = new Car();
		c2.Model="Mercedes";
		c2.price=1254892255;
		//c2.wheels=4;
		
		System.out.println(c1.Model);
		System.out.println(wheels);
		System.out.println(c2.Model);
		Car.wheels=8;
		System.out.println(Car.wheels);  
		
	}

}
