package wrapper;

public class CharClass {

	public static void main(String[] args) {
		
		

Character ch = new Character('7');

System.out.println(ch);

boolean f1 = Character.isLowerCase(ch);
System.out.println(f1);
boolean f2 = Character.isUpperCase(ch);
System.out.println(f2);
boolean f3 = Character.isDigit(ch);
System.out.println(f3);
	}

}
