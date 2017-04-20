
public class Test 
{
	public static void main(String a[])

	{
		Student st1= new Student(1,"shubham");
		//st1.showStud();
		//using getter
		int r=st1.getRollno();
		System.out.print(r);
		String n=st1.getname();
		System.out.print(n);
		
		Student st2=new Student(9,"Shankar");
		//st2.showStud();
		// OR using getter
		System.out.print(st2.getRollno());
		System.out.print(st2.getname());
		
	}
}
