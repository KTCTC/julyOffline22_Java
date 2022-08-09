package ifstatements;

public class IFElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 50;
		
		if (marks<40)
		{
			System.out.println("You are fail");
		
		}
		else if(marks>=40)
		{
			System.out.println("You are pass");
		}
		else if (marks>=40 && marks<50)
			{
				System.out.println("You passes with second class");
			}
			else if (marks>=50 && marks<60)
			{
			
				System.out.println("you are passed with first class");
			}
			else if (marks>=60)
			{
				System.out.println("You passes with destinction");
			}
			else
			{
				System.out.println("invalid marks");
			}
		

	}

}
