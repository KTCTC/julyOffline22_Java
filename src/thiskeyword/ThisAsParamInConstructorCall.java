package thiskeyword;

public class ThisAsParamInConstructorCall {
	int aa;
	String npk;

	public ThisAsParamInConstructorCall(int a)
	{
		A ob = new A(this);
	}
	public ThisAsParamInConstructorCall()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisAsParamInConstructorCall oo = new ThisAsParamInConstructorCall(23);
		
		ThisAsParamInConstructorCall obj = new ThisAsParamInConstructorCall();
		obj.nonStaticMethod();
		
		
		
		System.out.println(obj.aa);
		
		
	}

	public void nonStaticMethod() {
		
		sm(this);
		A oo = new A(this);
		oo.aClassMethod(this);
	}

	public void sm(ThisAsParamInConstructorCall oo) {
		oo.aa = 67;
	}

}
