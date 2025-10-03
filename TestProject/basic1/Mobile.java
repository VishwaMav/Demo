package basic1;

public class Mobile {

	String mobileModel = "MI 2025";
	int mobileWeight = 5;
	boolean isFullChanrge = true;
	double mobileCost = 25000.00;
	
	public static void main(String[] args) 
	{
		Mobile mob = new Mobile();
		
		System.out.println(mob.mobileModel);
		int mw =mob.mobileWeight;
		System.out.println(mw);
		
		System.out.println(mob.isFullChanrge);
		
		double cost =mob.mobileCost;
		System.out.println(cost);
		

	}

}
