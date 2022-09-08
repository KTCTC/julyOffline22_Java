package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap<Integer, String> data = new HashMap<>();
		data.put(1, "Amit");
		data.put(new Integer(2), new String("Sanket"));
		data.put(3, "Amitkumar");
		data.put(8, "Zahir Khan");
		System.out.println(data);
		data.put(1, "Sachin");
		data.put(5, "Sachin");
		data.put(111, "Sachin");
		
		data.remove(111);
		System.out.println(data.size());
		System.out.println(data.get(1));
		
		for (Entry<Integer, String> each:data.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
		}
		

	}

}
