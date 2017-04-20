
public class Trainer extends Person {
	
	private int num_of_skills;
	private int expInYrs;
	
	public Trainer(String fname, String lname, String address,
			int num_of_skills, int expInYrs)
	{
		super(fname, lname, address);
		this.num_of_skills = num_of_skills;
		this.expInYrs = expInYrs;
	}

		public void trainerkamethod() {
			
		}
	@Override
	public void showDetails() 
	{
		
		System.out.println(this.getFname());
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.getClass());
		System.out.println(this.num_of_skills);
		System.out.println(this.expInYrs);
	}
	
	

	
}
