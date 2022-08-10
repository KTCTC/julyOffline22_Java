package switchh;

public class SwitchStatementNested {

	public static void main(String[] args) {
		
		String str = "first";
		
		int year = 1;
		
		switch(str)
		{
		
		case "first": 
			System.out.println("your subjects are M1, Physics, Chemistry");
			
			switch (year) {
			case 1:
				System.out.println("You have common subjects");
				
				break;
			case 2:
				System.out.println("You have mechanical subjects");
				
				break;

			default:
				break;
			}
			
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
