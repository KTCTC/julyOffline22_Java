package collection;

import java.util.ArrayList;

public class ArrayListCLass2 {

	public static void main(String[] args) {

		ArrayList<String> data = new ArrayList<>();
		String str1 = "Welcome";
		String str2 = new String("KTCTC");

		data.add(str1);
		data.add(str2);
		data.add("July Batch");
		data.add("34");
		
		System.out.println(data.get(2));
		data.remove(3);
		System.out.println(data.size());
		
		for (int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for (String each:data)
		{
			System.out.println(each);
		}
		

	}

}
