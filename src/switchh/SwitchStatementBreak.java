package switchh;

public class SwitchStatementBreak {

	public static void main(String[] args) {
		
		int a = 4;
		
		switch(a)
		{
		case 1:
			System.out.println("Inside case 1");
			System.out.println("Second line in case 1");
			if (a%2==0)
			{
				System.out.println("case is even");
			}
			else
			{
				System.out.println("Case is odd");
			}
			break;
		case 2:
			System.out.println("Inside case 2");
			break;
		case 3:
		System.out.println("inside case 3");
		break;
		default:
			System.out.println("case is not matched");
			break;
		case 4:
			System.out.println("Inside case 4");
			break;
		}
		

	}

}
