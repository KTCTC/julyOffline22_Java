package enumdatatype;

public class SampleClass {

	public static void main(String[] args) {
		System.out.println(YearsOfEngg.FORTHYEAR);
		
		YearsOfEngg a = YearsOfEngg.FORTHYEAR;
		
		switch(a)
		{
		
		case FIRSTYEAR: 
			System.out.println("your subjects are M1, Physics, Chemistry");
			
			break;
		
		case SECONDYEAR:
			System.out.println("your subjects are M2, SOM, JAVA");
			break;
			
		case THIRDYEAR:
			System.out.println("your subjects are TOM, Heat transfer, DOM");

		break;
		
		case FORTHYEAR:
			System.out.println("your subjects are FEA, TQM, ICE");

		break;
		
		default:
			System.out.println("You are YD student");
			break;
		
		}

	}

}
