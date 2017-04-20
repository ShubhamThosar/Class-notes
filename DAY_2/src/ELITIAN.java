import java.util.Date;


public class ELITIAN extends Associate {
	private int groupId;
	private String mappedIBU;
	
	public ELITIAN(int id, String name, Date joinDate,int gId, String IBU)
	{
		super(id, name, joinDate);
		this.groupId=gId;
		this.mappedIBU=IBU;
		// TODO Auto-generated constructor stub
		
	}
	
	

	public int getGroupId() {
		return groupId;
	}



	public String getMappedIBU() {
		return mappedIBU;
	}



	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}



	public void setMappedIBU(String mappedIBU) {
		this.mappedIBU = mappedIBU;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString()+this.groupId+" "+this.mappedIBU;
		//using getter
		return super.toString()+" "+this.getGroupId()+" "+this.getMappedIBU();
	
	}
	}
	


