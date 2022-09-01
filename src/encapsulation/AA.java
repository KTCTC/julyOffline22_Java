package encapsulation;

public class AA {

	public static void main(String[] args) {
		
		EncapClassWriteOnly oo = new EncapClassWriteOnly();
		oo.setRollNum(233);
		oo.setName("Amitabh");
		oo.displayeStudentInfo();
		
		EncapClass obj = new EncapClass();
		obj.setRollNum(333);
		int rr = obj.getRollNum();
		System.out.println(rr);
		obj.setName("KTCTC");
		String nn = obj.getName();

	}

}
