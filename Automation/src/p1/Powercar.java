package p1;

public class Powercar {
     String name;
     int capacity;
     
     public Powercar() {
    	 System.out.println("Inside default constructor");
     }
     
     public Powercar(String n, int c) {
    	 name = n;
    	 capacity= c;
    	 System.out.println("Inside overloaded constructor");
     }
}
