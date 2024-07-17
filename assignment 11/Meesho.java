class Meesho{
          static String name;
		  static long no;
		  static String eml;
		  static String gen;
		  static String languages;
		  static String occu;
		  static String business;
		  static int code;
		  static String city;
		  static String st;
public static boolean createAccount(String fullName,long phoneNo,String email,
String gender,String languagesSpoken,String occupation,String BusinessName,
int pinCode,String cityName,String state){


boolean isUserAccountCreated=false;

          name=fullName;
		   no=phoneNo;
		   eml=email;
		   gen=gender;
		  languages=languagesSpoken;
		   occu=occupation;
		   business=businessName;
		  code=pinCode;
		  city=cityName;
		  st=state;
		 return isUserAccountCreated;

}


		public static void getUserInfo(){ 
       System.out.println("The Full Name Of the User is:"+name);
	   System.out.println("The Phone Number of User is :"+no);
	   System.out.println("The Email of the User is:"+eml);
	   System.out.println("The Gender of the User is:"+gen);
	   System.out.println("The Languages Spoken by the user is:"+languages);
	   System.out.println("The Occupation of the User is:"+occu);
	   System.out.println("The Business Name of the User is:"+business);
	   System.out.println("The Pincode is:"+code);
	   System.out.println("The City Name is:"+city);
	   System.out.println("The State Name is:"+st);
	  
}
}

