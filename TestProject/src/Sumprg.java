
public class Sumprg {

		static int sum(int n)
		{
			int sum = 0;
			for(int i=1; i<=n; i++)
			{
				sum = sum+i;
			}
			return sum;
		}
		

		public static void main(String[] args) {
			int x = sum(8);
	        System.out.println("Sum ="+x);
	        
	    	int a = 5;
			int b = 3;
			int c = 1;			
		}

	}
