package method.info;

public class SampleClassTwo {

	public static void main(String[] args) {
		methodFromSampleTwoClass();
		
		SampleClass.sampleMethod();
	}
	
	public static void methodFromSampleTwoClass()
	{
		System.out.println("method From Sample Two Class");
	}
	
	public  void nonstaticMethodFromSampleTwoClass()
	{
		System.out.println("non static method From Sample Two Class");
	}

}
