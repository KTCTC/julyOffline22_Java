package returntype;

public class ReturnTypesInJava2 {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 89;
		ReturnTypesInJava2 obj = new ReturnTypesInJava2();
		ReturnTypesInJava2 jk = new ReturnTypesInJava2();
		
		ReturnTypesInJava2 pk = obj.getInstanceOfClass(jk);		
		obj.b = 9999;
		ReturnTypesInJava2 oo = obj.sampleMethod();
		System.out.println(oo.a);
		System.out.println(pk.b);
	}

	public ReturnTypesInJava2 sampleMethod() {
		ReturnTypesInJava2 obj = new ReturnTypesInJava2();
		obj.a = 90;
		obj.b = 33;
		return obj;
	}
	
	public ReturnTypesInJava2 getInstanceOfClass(ReturnTypesInJava2 obj)
	{
		obj.a = 333;
		obj.b = 444;		
		return obj;
	}
}
