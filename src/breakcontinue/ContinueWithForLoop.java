package breakcontinue;

public class ContinueWithForLoop {

	public static void main(String[] args) {

		int arr[] = { 23, 4, 78, 23, 4 };

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

			continue;
			

		}

		char charr[] = { 'x', 'a', 'c', 'e', 'u' };
		for (int i = 0; i < charr.length; i++) {
			if (charr[i] == 'a' || charr[i] == 'e' || charr[i] == 'u' || charr[i] == 'i' || charr[i] == 'o') {
				System.out.println("Arrays has Vovel");
				continue;
			}

			System.out.println("This array has consonent");
		}

	}

}
