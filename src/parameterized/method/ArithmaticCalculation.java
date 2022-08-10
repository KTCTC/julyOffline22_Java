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
	
	public static void calculateSimpleinterest(int principle, float rate, float year)
	{
		float si = (principle*rate*year)/100;
		float actualAmount = si+principle;
		System.out.println("Interest amount = "+si);
		System.out.println("Total amount = "+actualAmount);
	}
	
	public static void calculateCompontInterest(int principle, float rate, float year)
	{
		double ci = principle*(Math.pow((1+rate/100), year));
		System.out.println("Total amount = "+ci);
	}
	public static void main(String[] args) {
		calculateCompontInterest(1500, 7.5f, 2);
		calculateSimpleinterest(1000, 7, 2);
	}

}
