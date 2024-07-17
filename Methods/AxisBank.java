class AxisBank{


static String fullName;
static String emailId;
static String phoneNum;
static long adhaarNumber;
static String panId;
static String accountType;
static String permanantAddress;
static String gender;
static String dateOfBirth;
static String nominee;
static boolean isAccountCreated;

	public static boolean createAccount(String fullName,
	String emailId,String phoneNumber, long adhaarNumber, String panId, String accountType, String permanantAddress, String gender, String dateOfBirth, String nominee){
	System.out.println("Account Creation Started.....");
			boolean isAccountCreated=false;
	
		if(fullName != null && emailId != null && adhaarNumber <= 0 && panId != null)
		{//init\
				System.out.println("validation successfull.......initializing data into the system");
				  fullName = fullName;
				  emailId = email;
				  phoneNumber = phoneNumber;
				  adhaarNumber = adhaarNo;
				  panId = pan;
				  accountType = typeOfAccount;
				  permanantAddress = address;
				  gender = gender;
				  dateOfBirth = dob;
				  nominee = nominee;
				  isAccountCreated = true;
				  System.out.println("Account Created");
	
		}
	}
	else{
		System.out.println("please provide valid full name and address");
		
	}
	System.out.println("Account Creation Ended....");
	return isAccountCreated;
	
	public static void getAccountDetails(){
	
				System.out.println("Given full name is:" +fullName);
				System.out.println("Holder email id is" +emailId);
				System.out.println("Holder Phone Number is" +phoneNumber);
				System.out.println("" +adhaarNumber);
				System.out.println("" +panId);
				System.out.println("" +accountType);
				System.out.println("" +permanantAddress);
				System.out.println("" +gender);
				System.out.println("" +dateOfBirth);
				System.out.println("" +nominee);
				System.out.println("" +isAccountCreated);
	
	
	
	
	
	}
	
	
	
}