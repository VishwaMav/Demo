
public class ExceptionClass {

		public static void main(String[] args) 
		{
			int a = 4;
			int b = 0;
			int c = 0;
			
			try
			{	
				c = a/b;
				System.out.println(c);
			}
			
			catch(Exception e)
			{
				System.out.println("Need to change a value");
			}
			
			finally
			{
				System.out.println("Bye...");
				System.out.println("In branchdemo");
			}
		}

	}


