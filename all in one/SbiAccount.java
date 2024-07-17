class SbiAccount{
	static double balance;
	public static double debit(double amount){
	System.out.println("Debit Started");
	if(amount<= balance)
	balance = balance - amount;
	else
	System.out.println("Insufficient Balance");
	System.out.println("Debit ended");
	return balance;
	
	
	
	}
	public static double credit(double amount){
	System.out.println("Credit Started");
	balance = balance + amount;
	System.out.println("Credit ended");
	return balance;
}
}
