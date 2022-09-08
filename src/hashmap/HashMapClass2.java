package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass2 {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<>();
		data.put("FirstName", "Amit");
		data.put("LastName", "Patil");
		data.put("Mobile", "8988878767");
		data.put("Address", "Pune");
		
		
		for (Entry<String, String> each:data.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
		}
		

	}

}
