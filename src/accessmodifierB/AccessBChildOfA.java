package accessmodifierB;

import accessmodifierA.AccessA;

public class AccessBChildOfA extends AccessA{
	public AccessBChildOfA()
	{
		super(23.4f);
	}

	public static void main(String[] args) {
		AccessA privateConst = new AccessA(23,true);
		AccessA defaultConst = new AccessA("eeer");
		AccessA protectConst = new AccessA(34.2f);
		AccessA oo = new AccessA();
		AccessBChildOfA obj = new AccessBChildOfA();
		System.out.println(obj.publicInt);
		System.out.println(obj.privateInt);
		System.out.println(obj.defaultInt);
		System.out.println(obj.protectedInt);
		obj.publicMethod();
		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
	}

}
