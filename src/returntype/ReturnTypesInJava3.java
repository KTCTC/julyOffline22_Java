package returntype;

public class ReturnTypesInJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = additionOfTwoNumber();
		System.out.println(b);
		float z = substraction(5, 56.4f);
		System.out.println(z);

	}
	
	public static int additionOfTwoNumber()
	{

     for (int i=0;i>5;i++)
     {
    	 System.out.println(i);
    	 
    	 return 5;
    	 
     }
     return 7;
		
	}
	
	public static  float substraction(float a, float b)
	{
		if (a>3)
		{
			return a;
		}
		else
		{
			return 5;
		}
		
		
	}
	
	
	
	
	

}
