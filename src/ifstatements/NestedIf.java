package ifstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		boolean flag = false;
		
		if (a>5)
		{
			System.out.println("inside outer if");
			
			if (flag)
			{
				System.out.println("inside inner if");
			}
			else
			{
				System.out.println("insede inner else");
			}
		}
		else
		{
			System.out.println("outer else");
			if (flag)
			{
				System.out.println("if inside else");
			}
		}
		

	}

}
