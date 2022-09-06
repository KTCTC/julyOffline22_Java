package exceptions;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int a = 89;
		int b = 0;
		int c = 0;
		String nn = "34m";
		
		
		try {
			int z = Integer.parseInt(nn);
			System.out.println(z);
		} catch (NumberFormatException e1) {
			
			e1.printStackTrace();
		}
		
		try {
		c = a/b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			c =a;
		}
		
		
		System.out.println(c);
		
	}

}
