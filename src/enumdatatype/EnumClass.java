package enumdatatype;

public class EnumClass {
public enum workingDays {mon,tue,wed,the,fri};
	public static void main(String[] args) {
		byte a = 90;
		System.out.println(workingDays.mon);
		
		workingDays abc;
		
		abc = workingDays.mon;
		System.out.println(abc);
	
	}

}
