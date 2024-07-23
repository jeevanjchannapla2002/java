class AccountDetailsRunner
{
	public static void main(String [] banking)
	{
	AccountDetails bank1=new AccountDetails();
	AccountDetails bank= new AccountDetails(1,"Canara Bank Davanagere","Vidya Nagar",1813101023495L,"Jeevan J C","Savings"
,"CNRB1813","Davanagere");


	/*boolean isAccountCreated=bank.createAccount(1,"Canara Bank Davanagere","Vidya Nagar",1813101023495L,"Jeevan J C","Savings"
,"CNRB1813","Davanagere");
	System.out.println("Account Created?:"+isAccountCreated);*/
	
	
	bank.getAccountDetails();
	}
}