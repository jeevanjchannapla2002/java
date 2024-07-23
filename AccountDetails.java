class AccountDetails
{
	int customerId;
	String bankName,branchName,address,accountType,ifscCode,AccountHolderName;
	long accountNo;
	boolean isAccountCreated=false;
	
	public AccountDetails()
	{
		System.out.println("Default Constructor");
	}
	
	public AccountDetails(int customerId,String bankName,String branchName,
	long accountNo,String AccountHolderName,String accountType,String ifscCode,String address)
	{
		if(customerId>0 && bankName!=null && branchName!=null && 
		address!=null && accountType!=null && ifscCode!=null && accountNo>0 && AccountHolderName!=null)
		{
		System.out.println("Parametertised constructor");
		this.customerId=customerId;
		this.customerId=customerId;
		this.bankName=bankName;
		this.branchName=branchName;
		this.address=address;
		this.accountType=accountType;
		this.ifscCode=ifscCode;
		this.accountNo=accountNo;
		this.AccountHolderName=AccountHolderName;
		this.isAccountCreated=true;
		}
		else
		{
			isAccountCreated=false;
		System.out.println("Enter Valid Details");
		}
	}
	
	
	/*public boolean createAccount(int customerId,String bankName,String branchName,
	long accountNo,String AccountHolderName,String accountType,String ifscCode,String address)
	{
		if(customerId>0 && bankName!=null && branchName!=null && 
		address!=null && accountType!=null && ifscCode!=null && accountNo>0 && AccountHolderName!=null)
		{
		this.customerId=customerId;
		this.bankName=bankName;
		this.branchName=branchName;
		this.address=address;
		this.accountType=accountType;
		this.ifscCode=ifscCode;
		this.accountNo=accountNo;
		this.AccountHolderName=AccountHolderName;
		this.isAccountCreated=true;
		}
		else
		{
			isAccountCreated=false;
			System.out.println("Enter Valid Details");
		}
		return isAccountCreated;
	}*/
	
	
	
	
	
	
	public void getAccountDetails()
	{
		if(isAccountCreated==true)
		{
			System.out.println("CustomerID: "+this.customerId+"\n"+"BankName: "+bankName+"\n"+"BranchName: "+branchName+
	"\n"+"AccountNumber: "+accountNo+"\n"+"AccountHolderName: "+AccountHolderName+"\n"+"AccountType: "+accountType+
	"\n"+"ifscCode: "+ifscCode+"\n"+"Address: "+address);
		}
		else{
			return;
		}
	}
}