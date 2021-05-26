abstract class Vehicle
{
	abstract void noOfWheels();
	abstract void capacity();
}

class Bike extends Vehicle
{
	void noOfWheels()
	{
		capacity();
		stands();
		System.out.println("WHEELS :"+2);
	}
	void capacity()
	{
		System.out.println("CAPACITY :2");
	}
	void stands()
	{
		System.out.println("STANDS :2");
	}
}

abstract class Car extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("WHEELS :4");
	}
}

class Buggati extends Car
{
	void capacity()
	{
		noOfWheels();
		System.out.println("CAPACITY :2");
	}
}

public class Abs
{
	public static void main(String[]st)
	{
		Vehicle v;            // =new vehicle();
		
		Car c;	         // =new Car();

		c=new Buggati();     // dynamic method dispatch
		c.capacity();

		Bike b=new Bike();
		Buggati bg=new Buggati();

		System.out.println("\n BIKE");
		b.noOfWheels();

		System.out.println("\n BUGGATI");
		bg.capacity();
	}
}