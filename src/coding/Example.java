package coding;

public class Example {

	public static void main(String[] args) {
		Car v=new Car();
		
		System.out.println(v.i);

	}

}
class Vehicle{
	
	int i=10;
	public void color() {
		System.out.println("vehicle color");
	}
}

class Car extends Vehicle{
	int i=20;
	public void color() {
		System.out.println("car color is black");
	}
}