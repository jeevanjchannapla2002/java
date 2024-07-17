class FlipKart{
	
	
	
    static String first;
	static String last;
	static long no;
	static String eml;
	static String gen;
	static String db;
	static int ot;
	
	public static boolean createAccount(String firstName,String lastName,long mobileNumber,
	String email,String gender,String dob,int otp){
	
	
	
	boolean isUserAccountCreated=false;
	 first=firstName;
	 last=lastName;
	 no=mobileNumber;
	 eml=email;
	 gen=gender;
	 db=dob;
	 ot=otp;
	

	
	return isUserAccountCreated;
	
	}
	public static void getUserInfo(){
	System.out.println("The First name of User is:"+first);
	System.out.println("The Last Name of User is:"+last);
	System.out.println("The Mobile Number of user is:"+no);
	System.out.println("The Email of User is:"+eml);
	System.out.println("The Gender of User is:"+gen);
	System.out.println("The Date of Birth of User is:"+db);
	System.out.println("The otp is:"+ot);
	
	
	
	
	
	
	}
	   
}  
	    