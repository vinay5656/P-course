package interfaceJava8;

interface Vehicale{
	default void message() {
		System.out.println("Inside Vehicale");
	}
}

interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}

class Car implements Vehicale,FourWheeler{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Inside the car message method.");
		Vehicale.super.message();
//		FourWheeler.super.message();
	}
	
	
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.message();

	}

}
