import java.util.Scanner;


public class Testemp {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("how many emp are there :" );
		int num_of_emp=s.nextInt();
		Emp earr[]=new Emp[num_of_emp];
		
		
		for (int i = 0; i < earr.length; i++) 
		{
			
			earr[i]= new Emp();
			//Scanner s1=new Scanner(System.in);
			
			System.out.println("enter emp id");
			int id=s.nextInt();
			earr[i].setEmpID(id);			
		}
			for (int i = 0; i < earr.length; i++) {
			
				earr[i].showEmpID();
			}
	}
	

}
