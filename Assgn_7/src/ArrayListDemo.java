
public class ArrayListDemo {

	public static void main(String[] args) {
		
		Students s = new Students();
		
		s.setNames("shubham");
		s.setNames("ravina");
		s.setNames("rohit");
		
		
		s.searchName("sarvesh");
		s.serachName(1);
		s.printNames();
		s.removeName("rohit");
		s.printNames();
		
		
	}
}
