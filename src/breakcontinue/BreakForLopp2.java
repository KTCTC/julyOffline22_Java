package breakcontinue;

public class BreakForLopp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCD:for (int i = 0; i<2;i++)
		{
			System.out.println("Inside outer for loop");
			
		PQRS:for (int j=0;j<2;j++)
			{
				System.out.println("Inside inner for loop");
					
				continue ABCD;
			}
			
		}
		
	}

}
