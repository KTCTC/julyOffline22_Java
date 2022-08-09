package ifstatements;

public class IFStatementClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before if statement");
		int c = 90;
		
		if (c>50)
			System.out.println("Inside if");		
		System.out.println("Ouside if");
		
		int a = 70;
		boolean flag = false;
		
		if (a>=18)
		{
			System.out.println("You can vote");
			System.out.println("Second line of code");
			int z = 67+55;
			System.out.println(z);
			
		}
		
		if (a%2==0)
		{
			System.out.println("Given number is even");
		}
		
		System.out.println("After if statement");
		if (a<100 || flag)
		{
			System.out.println("Sample code");
		}
		
		
		
		
		

	}

}
