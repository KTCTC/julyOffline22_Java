package breakcontinue;

public class BreackWithForEach {

	public static void main(String[] args) {
		int arr[] = {34,56,78,2,4};
		
		for (int each:arr)
		{
			System.out.println(each);
			if (each%2==0)
			{
				System.out.println("Array contains even number ");
				break;
			}
		}

	}

}
