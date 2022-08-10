package switchh;

public class SwitchStatementBreak3 {

	public static void main(String[] args) {
		
		String str = "firstyear";
		
		switch(str)
		{
		
		case "first": 
			System.out.println("your subjects are M1, Physics, Chemistry");
			
			break;
		
		case "second":
			System.out.println("your subjects are M2, SOM, JAVA");
			break;
			
		case "third":
			System.out.println("your subjects are TOM, Heat transfer, DOM");

		break;
		
		case "forth":
			System.out.println("your subjects are FEA, TQM, ICE");

		break;
		
		default:
			System.out.println("You are YD student");
			break;
		
		}
		

	}

}
