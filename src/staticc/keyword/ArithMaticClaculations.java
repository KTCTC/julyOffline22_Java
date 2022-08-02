package staticc.keyword;

public class ArithMaticClaculations {
	int a;
	int b;
	static int d = 44;
	public void addition()
	{
		ArithMaticClaculations obj = new ArithMaticClaculations();
		obj.a = 22;
		int c = a +b + obj.a + d + obj.d;
		System.out.println(c);
		
	}
	public static void substraction()
	{
		ArithMaticClaculations obj = new ArithMaticClaculations();
		int c = obj.a - obj.b;
		System.out.println(c);
		obj.addition();
	}
	
	public static void main(String[] args) {
		int mm = 5;
		ArithMaticClaculations obj = new ArithMaticClaculations();
		obj.a = 45;
		ArithMaticClaculations.d = 23;
		ArithMaticClaculations obj1 = new ArithMaticClaculations();
		obj1.b = 89;
		obj.addition();
		obj1.addition();
		obj1.substraction();
		ArithMaticClaculations.substraction();
		
		 // obj.mm = 44; 
		 // ArithMaticClaculations.mm = 22;
		 
		
		System.out.println("end of code");
	}
	

}
