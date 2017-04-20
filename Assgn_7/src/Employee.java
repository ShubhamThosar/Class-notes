import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Employee{

	HashMap<String, String> empNames = new HashMap<String, String>();

	public void setname() 
	{
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("enter rollno: ");
			String rn = s.next();
			System.out.println("enter name for student :");
			String emp = s.next();

			empNames.put(rn, emp);
		}
	}

	public void printName() 
	{
		Enumeration e= Collections.enumeration(empNames.keySet());
		Enumeration e1= Collections.enumeration(empNames.values());
		
		while(e.hasMoreElements() && e1.hasMoreElements())
			
			System.out.println(e.nextElement()+"   "+e1.nextElement());
		
		
		
		
		/*Enumeration e = (Enumeration) empNames.entrySet();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}*/

	}

	public void getName(String key)
	{
		System.out.println("value of key is :"+empNames.get(key));
	}

	public void printNameKeySet() 
	{
		
	}
	
	public void printSize() 
	{
		System.out.println("size of hashmap map :" +empNames.size());
	}
	
	public void remove(String key) 
	{
		empNames.remove(key);
	}

}
