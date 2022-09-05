package stringinjava;

public class StringClass {

	public static void main(String[] args) {
		String str = new String("Welcome");
String data = "Welcome";
String dd = "Welcome";
String dd1 = "welcome";


String str1 = new String("Welcome to");
String str2 = "Welcome to";
String str3 = new String("Welcome");

boolean flag = data==dd;
System.out.println(flag);
boolean flag2 = data==str;
System.out.println(flag2);

boolean flag3 = str==str3;
System.out.println(flag3);

	}

}
