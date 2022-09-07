package exceptions;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e = addition();
		System.out.println(e);

	}
	
	public static int addition()
	{
		try
		{
			return 2;
		}
		catch (Exception e)
		{
			return 4;
		}
		finally
		{
			return 6;
		}
		
	}

}
