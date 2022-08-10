package switchh;

public class SwitchStatementBreak2 {

	public static void main(String[] args) {
		
		char ch = 'u';
		
		switch(ch)
		{
		case 'a':
		case 'A': 
			System.out.println("Provided character is vovel");
			
			break;
		case 'e':
		case 'E':
			System.out.println("Provided character is vovel");
			break;
		case 'i':	
		case 'I':
			System.out.println("Provided character is vovel");
		break;
		case 'o':
		case 'O':
			System.out.println("Provided character is vovel");
		break;
		case 'u':
		case 'U':
			System.out.println("Provided character is vovel");
		break;
		default:
			System.out.println("provided character is consonent");
			break;
		
		}
		

	}

}
