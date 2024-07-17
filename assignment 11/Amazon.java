class Amazon{

         static String user;
		 static String pwd;
		 static String gen;
		 static String db;
		 static long contact;
		 static int ot;
		 static String add;
		 static String eml;
		 
public static boolean createAccount(String userName, String password,
String gender,String dob,long contactNo,int otp,String address,String email){   

      boolean isAccountCreated=false;
	    user =userName;
		pwd =password;
		gen=gender;
		db=dob;
		contact=contactNo;
		ot=otp;
		add=address;
		eml=email;
			
	  return isAccountCreated;
}
	  
	  public static void getAccountDetails(){
		  
		    System.out.println("The User Name is:"+user);
			System.out.println("The User Password is:"+pwd);
			System.out.println("The User Gender is:"+gen);
			System.out.println("The Date of Birth of User is:"+db);
			System.out.println("The Contact Number of user is:"+contact);
			System.out.println("The Otp of user Account is:"+ot);
			System.out.println("The Address of the User is:"+add);
			System.out.println("The Email of User is:"+eml); 
		  
	  }


}





