package basic1;

public class LearnDataTypes {

	//variable name is a camelcase
			byte carModel = 25;
			long owenerPhoneno = 9876543215L;
			
			boolean isPuncture = false;
			
			char carType = 'S';
			
			//decimal values feault double
			float fuelCapacity = 35.5f;
			
			double carprice = 800000.5;
			
	public static void main(String[] args) 
	{
		LearnDataTypes ldt = new LearnDataTypes();
		
        System.out.println(ldt.fuelCapacity);
        float fc =ldt.fuelCapacity;
        System.out.println(fc);
	}

}
