class Myntra{
        
	  static String fname;
	  static long phNo;
	  static String eml;
	  static long altNo;
	  static String name;


public static boolean createAccount(String fullName,long phoneNo,
String email,long alternatePhNo,String hintName){

boolean isUserAccountCreated=false;

       fname=fullName;
	   phNo=phoneNo;
	   eml=email;
	   altNo=alternatePhNo;
	   name=hintName;

return isUserAccountCreated;
}

public static void getUserDetails(){
	System.out.println("The Name of the User is:"+fname);
    System.out.println("The Phone Number of User is:"+phNo);
    System.out.println("The User Email is:"+eml);
    System.out.println("The Alternative Phone Number is:"+altNo);
    System.out.println("The Hint Name is:"+name); 
}
}
