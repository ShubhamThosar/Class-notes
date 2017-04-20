package ExceptionHandling;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Account a= new Account();
		
		try {
			a.setAccId(s.next());
		}
		catch (AccountException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		a.setAccType(s.next());
		System.out.println(a);

	}

}
