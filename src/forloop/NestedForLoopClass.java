package forloop;

public class NestedForLoopClass {

	public static void main(String[] args) {
		System.out.println("Before code");
		
		
	ABCD:	for (int i = 0; i<2;i++)
		{
			System.out.println("Inside outer for loop");
			
		PQRS:for (int j=0;j<2;j++)
			{
				System.out.println("Inside inner for loop");
				
				
				
			xyz:	for (int k=0;k<2;k++)
				{
				System.out.println("Inside third for loop");
				System.out.println(i +" "+ j+ " "+k);
				}
				
			}
		}
		
		
		System.out.println("After code");

		

	}

}
