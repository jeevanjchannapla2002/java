class Passport
{
static String cpvLocation,surName,givenName,dob,email,pwd,confirmPassword;
static int dcdrLocation;
static boolean isemailLoginIDSame;
static boolean isPassportCreated=false;
public static boolean createPassport(String  cpvLocation,int dcdrLocation,String surName,
String givenName,String dob,String email,boolean isemailLoginIDSame,String pwd,String confirmPassword)
{
	
	System.out.println("Passport Creation is Started");
	if(cpvLocation != null && dcdrLocation>=0 && givenName!=null && surName!=null && dob !=null 
	&& email!=null && isemailLoginIDSame==true && pwd!=null && confirmPassword !=null)
	{
	Passport.cpvLocation=cpvLocation;
	Passport.surName=surName;
	Passport.givenName=givenName;
	Passport.dob=dob;
	Passport.email=email;
	Passport.pwd=pwd;
	Passport.confirmPassword=confirmPassword;
	Passport.dcdrLocation=dcdrLocation;
	Passport.isemailLoginIDSame=isemailLoginIDSame;
	isPassportCreated=true;
	Passport.isPassportCreated=isPassportCreated;
	System.out.println("Details Entered Successfully");
	}
	else
	{
		System.out.println("Invalid Details Please.. Enter Valid Details");
	}
	System.out.println("Passport Creation is Ended");
	return isPassportCreated;
}

public static void fetchPassportDetails()
{
	if(isPassportCreated==true)
	{
	System.out.println("Entered Details");
		System.out.println("cpvLocation:"+cpvLocation+"\ndcdrLocation:"+dcdrLocation+"\nsurName:"
		+surName+"\ngivenName:"+givenName+"\ndob:"+dob+"\nemail:"+email+"\nisemailLoginIDSame:"
		+isemailLoginIDSame+"\npwd:"+pwd+"\nconfirmPassword:"+confirmPassword);
	}
	else{
		return ;
	}
}
}