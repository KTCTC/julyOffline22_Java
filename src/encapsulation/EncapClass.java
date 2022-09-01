package encapsulation;

public class EncapClass {
	
	private int rollNum;
	private String name;
	
	public int getRollNum() {
		return rollNum;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
