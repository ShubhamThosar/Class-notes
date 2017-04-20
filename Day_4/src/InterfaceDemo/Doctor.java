package InterfaceDemo;

import java.util.Scanner;

public class Doctor implements MyInterface {
	
	private String degree;
	private String name;
	
	
	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println(this.degree);
		System.out.println(this.name);
		
		
	}
	@Override
	public void putData() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter degree");
		this.degree=s.next();
		
		System.out.println("enter name");
		this.name=s.next();
		
		System.out.println("student data is......................");
		
	}
	

}
