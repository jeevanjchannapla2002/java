class SbiRunner{

	public static void main(String[] args){
		System.out.println("Main started");
	
	double amount = SbiAccount.credit(50000.00);
	System.out.println("The balance in ur Account is " + amount);
	
	 amount = SbiAccount.debit(50000.00);
	System.out.println("The balance in ur Account is " + amount);
	System.out.println("Main ended");
	
	}

}