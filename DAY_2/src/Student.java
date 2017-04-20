
public class Student 
{
	//data members
	private int rollno;
	private String name;

	//default cunstructor
	public Student()
	{
		System.out.println("in student default cunstr....");
	}

	//parameterised constructor
	public Student(int roll, String nm)
	{ 
		rollno=roll;
		name=nm;
	}

	int getRollno()
	{
		return rollno;
	}

	String getname()
	{ 
		return name;
	}

	public void showStud()
	{
		System.out.println("Rollno:"+rollno+"\nName:"+name);
	}
}
