package ExceptionHandling;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]= new int[4];
		arr[0]=1; arr[1]=2;arr[2]=3;arr[3]=4;
		try
		{
		System.out.println("enter the index: ");
		int idx=sc.nextInt();
		System.out.println("for array");
		System.out.println("charact at entered idex is"+arr[idx]);
		String str="Ganesh";
		System.out.println("for string");
		System.out.println("enter the index: ");
		idx=sc.nextInt();
		System.out.println("charact at entered idex is  "+str.charAt(idx));
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("for array:pls enter from 0 to 3.......");
		}
		
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("for string: pls enter val from 0 to 5... ");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("kutch bhi enter karte ho yaar.......");
		}
		
//		System.out.println("enter the numerator:");
//		int num= sc.nextInt();
//		System.out.println("enter the denom:");
//		int den=sc.nextInt();
//		try
//		{
//		float ans=num/den;
//		System.out.println("ans is "+ans);
//		}
//		finally
//		//catch(ArithmeticException a)
//		//we can use catch and finally
//		{
//			System.out.println("pls entr non 0 val for deno.......");
//		}
				
	}
}
