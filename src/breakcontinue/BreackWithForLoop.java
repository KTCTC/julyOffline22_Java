package breakcontinue;

public class BreackWithForLoop {

	public static void main(String[] args) {

		int arr[] = { 23, 4, 78, 23, 4 };
		
		char charr[] = {'x','a','c','e','u'};
		
for (int i = 0; i < arr.length; i++) {
			
			
			System.out.println(arr[i]);
			
			break;
			System.out.println("After break keyword");
			
		} 
		
		for (int i=0;i<charr.length;i++)
		{
			if (charr[i]=='a' || charr[i]=='e' || charr[i]=='u' || charr[i]=='i' || charr[i]=='o')
			{
				System.out.println("Arrays has Vovel");
				break;
			}
			
		}
		

		for (int i = 0; i < arr.length; i++) {
			
			
			System.out.println(arr[i]);
			if (i==3)
			{
			break;
			
			}
			System.out.println("Hello");
		}

	}

}
