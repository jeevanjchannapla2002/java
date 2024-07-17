class Instagram{

         static String name;
		 static String pwd;
		 static String birthDate;
		 static String emailId;
		 static long phNo;
		 static int otpNo;
		 

public static boolean createInstaAccount(String userName,String password,String dob,
                           String email,long phoneNo,int otp){
						   
						   
			boolean isInstaAccountCreated=false;
			name=userName;
			pwd=password;
			birthDate=dob;
			emailId=email;
			phNo=phoneNo;
			otpNo=otp;
			
			return isInstaAccountCreated;
			}
			public static void getUserDetails(){
			
			System.out.println("The User Name is:"+name);
			System.out.println("The Password of the user Account is:"+pwd);
			System.out.println("The Date of Birth of the user is:"+birthDate);
			System.out.println("The Email Provided by the user is:"+emailId);
			System.out.println("The Phone Number of the User is:"+phNo);
			System.out.println("The otp is:"+otpNo);
			}
			}
			
			