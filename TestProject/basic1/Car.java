package basic1; // day 1 prg1

public class Car 
{
	long owenerPhoneno = 9876543215L;
	boolean isPuncture = false;	
	char carType = 'S';
	String colour = "Blue";
	
	//decimal values feault double
	float fuelCapacity = 35.5f;	
	double carprice = 800000.5;
	
	//Access Specifier returnType method
	public void driveCar() //lower case first word, upper case second word // camelCase
	{
		int KmDriven = 500; // local variable
		System.out.println("Driving a Car");
		System.out.println(KmDriven);
		System.out.println(owenerPhoneno);
		//System.out.println();
	}
	
	public void applyBrake() //lower case first word, upper case second word // camelCase
	{
		System.out.println("Applied Brake");
		System.out.println(owenerPhoneno);
	}


	public static void main(String[] args) 
	{
		//ClassName objectName = new ClassName(); To create a object //object name - camel case
		Car myCar = new Car();
		
		//to call the method objectName.methodName();
		myCar.driveCar();
		myCar.applyBrake();
		
		//concat
		System.out.println("The car price is " +myCar.carprice);
	}
}
