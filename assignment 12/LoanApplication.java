class LoanApplication{

     static String bank;
	 static long bankAccNo;
	 static int creditScr;
	 static String typeOfLoan;
	 static double interest;
	 
public static boolean applyLoan(String bankName,long bankAccountNo,int creditScore,
String loanType, double rateOfInterest){

boolean isLoanApplied=false;
boolean isBankNameValid=false;
boolean isBankAccountNoValid=false;
boolean isCreditScoreValid=false;
boolean isLoanTypeValid=false;
boolean israteOfInterestValid=false;

    if(bankName!=null){
		 bank=bankName;
		 isBankNameValid=true;
	}else{
		System.out.println("Please Provide Valid Bank Name");
	} 
	
	if(bankAccountNo>0){
	     bankAccNo=bankAccountNo;
         isBankAccountNoValid=true;
    }else{
        System.out.println("Please Provide Valid Bank Account Number");
	}
	
	if(creditScore>0){
		creditScr=creditScore;
		isCreditScoreValid=true;
	}else{
        System.out.println("Please Provide Valid Credit Score");
	}
	
	if(loanType!=null){
		typeOfLoan=loanType;
		isLoanTypeValid=true;
	}else{
        System.out.println("Please Provide Valid Loan Type");
	}
	if(rateOfInterest>0){
		 interest=rateOfInterest;
		 israteOfInterestValid=true;
	}else{
        System.out.println("Please Provide Valid Rate of Interest Value");
	}
	 
return isLoanApplied;
}

public static void fetchLoanDetails(){
      System.out.println("The Bank Name is:"+bank);
	  System.out.println("The Bank Account Number is:"+bankAccNo);
	  System.out.println("The Credit Score is:"+creditScr);
	  System.out.println("The Type of the Loan is:"+typeOfLoan);
	  System.out.println("The Rate of interest is:"+interest);
	  
}
}