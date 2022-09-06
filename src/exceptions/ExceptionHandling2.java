package exceptions;

public class ExceptionHandling2 {
	
	public static void main(String[] args) {
		
		int a = 89;
		int b = 0;
		int c = 0;
		String nn = "34";
		int z = 0;
		
		try {
			 z = Integer.parseInt(nn);
			c = a/b;
			System.out.println(z);
		} catch (NumberFormatException e1) {
			z = 777;
			e1.printStackTrace();
		}
		catch (ArithmeticException e) {
			c = a;
		}
		catch(Exception e)
		{
			System.out.println("All exceptions are catched");
		}
		
		
		
		System.out.println(c);
		
	}

}
