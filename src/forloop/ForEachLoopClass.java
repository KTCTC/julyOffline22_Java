package forloop;

public class ForEachLoopClass {

	public static void main(String[] args) {

    int arr[] = {23,45,2,34};
    char chArr[] = {'q','w','w','n'};
    
    for (char each:chArr)
    {
    	System.out.println(each);
    }
    
    
    for (int each:arr)
    {
    	System.out.println("Inside for loop");
    	System.out.println(each);
    }
   
		
		

	}

}
