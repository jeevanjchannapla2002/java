class LinkedIn{
	 static String first;
	 static String last;
	 static String eml;
	 static String pwd;
	 static long mobNo;
	 static String uni;
	 static String clg;
	 static String count;
	 static String city;
	 static int code;
	 
	public static boolean createAccount(String firstName, String lastName,String email,
	String password, long mobileNo,String university,String college,String country,
	String cityName,int postalCode){
    

  boolean isUserAccountCreated=false;
       first=firstName;
	   last=lastName;
	   eml=email;
	   pwd=password;
	   mobNo=mobileNo;
	   uni=university;
	   clg=college;
	   count=country;
	   city=cityName;
	   code=postalCode;
  
  return isUserAccountCreated;
}  

public static void getUserInfo(){
	
             System.out.println("The First Name of User is:"+first);
			 System.out.println("The Last Name of user is:"+last);
			 System.out.println("The Email of User is:"+eml);
			 System.out.println("The Password of user is:"+pwd);
			 System.out.println("The Mobile Number of user is:"+mobNo);
			 System.out.println("The University Name is:"+uni);
			 System.out.println("The College Name is:"+clg);
			 System.out.println("The Country name is:"+count);
			 System.out.println("The City Name is:"+city);
			 System.out.println("The Postal Code of City is:"+code);
			 
}
}  