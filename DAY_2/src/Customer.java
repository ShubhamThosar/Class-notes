
public class Customer {
	private String custId;
	private String custName;
	private int custMobile;
	private static int count;

	static
	{
		System.out.println("in static block......");
		//count=10;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
		count++;
		System.out.println("in default custr");
	}

	public Customer(String custId, String custName, int custMobile) {
		super();
		count++;
		System.out.println("in para cunstr ");
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
	}

	//static data members cannot access nonstatic data member
	//nonstatic data members can access static data member
	public void showcustDetails(){
		System.out.println("no of obj created "+count);
		System.out.println("this.custId");
		System.out.println("this.custName");
		System.out.println("this.custMobile");
	}

	public static void showCount() {
		System.out.println("no of obj created "+count);

	}



}
