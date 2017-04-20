
public class demo_1 
{
	// a is reference to an array of String type
	public static void main(String args[])
	{
		
		//args[0]="10";
		//args[1]="20";
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int sum=n1+n2;
		System.out.println(" arg1 is "+args[0]);
		System.out.println(" arg2 is "+args[1]);
		System.out.println(" Sum is "+sum);
		System.out.println(" no of arguments passed are "+args.length);
		}
}