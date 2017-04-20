import java.util.ArrayList;
import java.util.Iterator;


public class Students {

	private ArrayList<String> names = new ArrayList<String>();

	public void setNames(String name) 
	{
		names.add(name);
	}

	public void searchName(String name)
	{

		if (names.contains(name))
		{
			System.out.println("student found");
		}
		else 
			System.out.println("not found");
	}

	public void serachName(int index) 
	{
		System.out.println("student is : "+names.get(index));
	}
	
	public void printNames() 
	{
		Iterator i = names.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public void removeName(String stuName)
	{
		names.remove(stuName);
	}
}
