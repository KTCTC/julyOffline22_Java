package returntype;

public class ReturnTypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aa[] = {23,45,67};
		int bb[] = {456,667,78};
		ReturnTypesInJava obj = new ReturnTypesInJava();
		int[] addition = obj.getAdditionOfArray(aa, bb);
		for (int each:addition)
		{
			System.out.println(each);
		}
		String ss = obj.concateStrings("Welcome to KTCTC", 2022, 34.3f, 'A');
		System.out.println(ss);
		float fl = obj.substraction(33.33f, 11.11f);
		System.out.println(fl);
		int a = additionOfTwoNumber();
		System.out.println(a);

	}
	
	public static int additionOfTwoNumber()
	{
		int c = 23+44;
		
		return c;
		
	}
	
	public float substraction(float a, float b)
	{
		float c = a-b;
		return c;
	}
	
	public String concateStrings(String str1, int a, float b, char ch)
	{
		String data = str1+a+ch+b;
		
		return data;
	}
	
	public int[] getAdditionOfArray(int[] a, int[] b)
	{
    int add[] = new int[a.length];
    
    for (int i=0; i<add.length;i++)
    {
    	add[i] = a[i]+b[i];
    }		
		return add;
		
	}

}
