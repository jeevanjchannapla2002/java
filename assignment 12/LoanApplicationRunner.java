class LoanApplicationRunner{
public static void main(String loan[]){

boolean isLoanApplied= LoanApplication.applyLoan("Canara",1813101023495L,200,"Personal Loan",300.0);



if(isLoanApplied=true){
	 LoanApplication.fetchLoanDetails();
	 }else{
		 System.out.println("Please Provide Valid Bank account Details......");
	 }
}
}