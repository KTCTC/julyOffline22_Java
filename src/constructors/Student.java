package constructors;

public class Student {
	int rollNumber;
	String name;
	float marks;
	public Student()
	{
		
	}
	
	public Student(int rNum)
	{
		
	}
	public Student(float mk)
	{
		marks = mk;
	}

	public Student(int rnum, float mk, String nn)
	{
		rollNumber = rnum;
		name = nn;
		marks = mk;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st = new Student();
Student st1 = new Student(56.5f);
Student st2 = new Student(23, 88.5f, "Sandip");
Student st3 = new  Student(44, 78.3f, "Amol");
st.Student();


	}
	public void Student()
	{
		System.out.println("This is student Method");
		
	}

}
