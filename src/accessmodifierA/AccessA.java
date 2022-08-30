package accessmodifierA;

public class AccessA {
 public int publicInt = 77;
 private int privateInt = 34;
 int defaultInt = 234;
 protected int protectedInt = 356757;
 
 public AccessA()
 {
	 
 }
 private AccessA(int privateConst,boolean f)
 {
	 
 }
 
 AccessA(String defaultConst)
 {
	 
 }
 
 protected AccessA(float protectedConst)
 {
	 
 }
 public void publicMethod()
 {
	 System.out.println("public method");
 }
 private void privateMethod()
 {
	 System.out.println("private method");
 }
  void defaultMethod()
 {
	 System.out.println("default method");
 }
 protected void protectedMethod()
 {
	 System.out.println("protected method");
 }
 
 public static void main(String[] args) {
	AccessA privateConst = new AccessA(23,true);
	AccessA defaultConst = new AccessA("eeer");
	AccessA protectConst = new AccessA(34.2f);
	AccessA obj = new AccessA();
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
