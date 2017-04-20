package InterfaceDemo;

public class Demo2 {

	public static void main(String[] args) {
		
		//String class is immutable
		String s= "Tom";
		System.out.println(s.hashCode());
		s=s.concat("jerry");
		System.out.println(s.hashCode());
		
		//StringBuffer class is mutable
		StringBuffer sb1=new StringBuffer("tom");
		System.out.println(sb1.hashCode());
		sb1=sb1.append("jerry");
		System.out.println(sb1.hashCode());
		
		//StringBuilder class is mutable
		StringBuilder sb2=new StringBuilder("tom");
		System.out.println(sb2.hashCode());
		sb2=sb2.append("jerry");
		System.out.println(sb2.hashCode());
		
	}
}
