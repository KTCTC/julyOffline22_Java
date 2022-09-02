package wrapper;

public class IntClass {

	public static void main(String[] args) {
		String str = "7878gf";
		
		int sd = Integer.parseInt(str);
		
		System.out.println(sd);
		
		Integer obbb = new Integer(str);
		System.out.println(obbb);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		Integer b = 78;
		
		Integer ab = new Integer(555);
		int cc = ab;

Integer a = new Integer(23);

int z = a.intValue();
System.out.println(z);

a = Integer.valueOf(444);

	}

}

/*
 * class Integer { final int value;
 * 
 * public int inValue() {
 * 
 * return value; }
 * 
 * public static Integer valueOf(int a) { Integer obj = new Integer(a); return
 * obj;
 * 
 * }
 * 
 * }
 */

