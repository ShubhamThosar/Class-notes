package ExceptionHandling;

public class Account {

	private String AccId;//must start from ACC & accId length must be 6
	private String AccType;

	
	public void setAccId(String accId) throws AccountException
	
	{
		
		if (accId.startsWith("ACC") && accId.length()==6)
			this.AccId = accId;
		else
			throw new AccountException("Acc id not valid.......");
	}
	
	public void setAccType(String accType) {
		this.AccType = accType;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account id: "+AccId+"\n Account Type:"+AccType;
	}



}
