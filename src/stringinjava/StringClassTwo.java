package stringinjava;

public class StringClassTwo {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		String data = "Showing 1-10 of 2348 records";
		String str = "Welcome to KTCTC";
		String ss = "    to    KTCTC     ";
		String str7 = "Welcome to KTCTC";
		
		char[] sdf = str.toCharArray();
		
		String ss8 = str.toUpperCase();
		System.out.println(ss8);
		String ss7 = str.toLowerCase();
		System.out.println(ss7);
		boolean fl6 = str.equalsIgnoreCase("welCome To KtctC");
		System.out.println(fl6);
		String ss6 = str.concat(data);
		System.out.println(ss6);
		boolean fl5 = str.equals(str7);
		System.out.println(fl5);
		
		boolean fl4 = str.contains("to CTC");
		System.out.println(fl4);
		String ss5 = str.substring(2, 8);
		System.out.println(ss5);
		
		String ss4 = str.substring(7);
		System.out.println(ss4);
		
		
		String ss3 = ss.trim();
		System.out.println(ss3);
		
		String[] stArr = data.split(" ");
		int count = Integer.parseInt(stArr[3]);
		
		System.out.println(count);
		
		String[] srr = str.split("to ");
		System.out.println(srr[1]);
		
		boolean fl2 = str.startsWith("Welcome  to");
		System.out.println(fl2);
		String ss2 = str.replace("to KTCTC", "20");
		System.out.println(ss2);
		 String ss1 = str.replace('T', 't');
		System.out.println(ss1);
		boolean fl1 = str.endsWith(ss);
		System.out.println(fl1);
		for (int j=str.length()-1;j>=0;j--)
		{
			System.out.println(str.charAt(j));
		}
		
		for (int i=0;i<str.length();i++)
		{
			
			System.out.println(str.charAt(i));
			
		}
		int lng = str.length();
		System.out.println(lng);
       char ch = str.charAt(4);
       System.out.println(ch);
	}

}
