package ifstatements;

public class IFElseStatementClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before if statement");
		int c = 90;
		
		if(c>40)
			System.out.println("Inside if");
		else
			System.out.println("inside else");
		System.out.println("AAAAAAAAAAAA");
		
		
		int a = -8;
		boolean flag = false;
		
		if (a>=18)
		{
			System.out.println("You can vote");
			System.out.println("Second line of code");
			int z = 67+55;
			System.out.println(z);
			
		}
		else
		{
			System.out.println("Inside else block");
		}
		
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
		System.out.println("After if statement");
		

	}

}
