package encapsulation;

public class EncapClassWriteOnly {
	
	private int rollNum;
	private String name;
	
	
	public void setRollNum(int rollNum) {
		
		if (rollNum<=0)
		{
			this.rollNum = 0;
		}
		else if(rollNum>100)
		{
			this.rollNum = 100;
		}
		else
		{
			this.rollNum = rollNum;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
public void displayeStudentInfo()
{
System.out.println(rollNum);
System.out.println(name);
}
}
