package stringinjava;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" How are you?");
		
		System.out.println(sb);
		
		StringBuffer str = new StringBuffer("Welcome to ");
		
		str.append("KTCTC");
		System.out.println(str);

	}

}
