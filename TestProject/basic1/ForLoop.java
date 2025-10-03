package basic1;

public class ForLoop {

	public static void main(String[] args) {
		int i =1;
		
		//initiaization; condition; icrement/decrement
		/*
		 * for(i=1; i<=10; i++) { System.out.println(i); }
		 */
//		for(i=5; i>=1; i--)
//		{
//			System.out.println(i);
//		}
		
		for(i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
