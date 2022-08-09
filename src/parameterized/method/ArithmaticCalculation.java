package parameterized.method;

public class ArithmaticCalculation {

	
	public void addition(float a, float b)
	{
		float c = a+b;
		System.out.println("Addition is = "+c);
		
	}
	
	public static void substraction(float a, int b)
	{
		float c = a-b;
		System.out.println("Substraction is = "+c);
	}
	
	public void calculateCircleArea(float redius)
	{
		float area = 3.14f * redius * redius;
		System.out.println("Area of circle = "+area + "m2");
	}
	
	public void concate (String str1,  char ch, String str2, int a)
	{
		String dd = str1+a+ch+str2;
		
		System.out.println(dd);
	}

}
