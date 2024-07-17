class Hospital{
        static String name;
		static String birthDate;
		static int ageOfPatient;
		static String add;
		static String gen;
		static long contactNum;
		static String occup;
		static long adharNum;
		static String diseaseName;
		static int token;
		
public static boolean registerPatient(String patientName,String dob,int age,String address,
String gender,long contactNo,String occupation,long adharNo,String typeOfDisease,
int tokenNo){

boolean isPatientRegistered=false;
boolean isPatientNameValid=false;
boolean isDobvalid=false;
boolean isAgevalid=false;
boolean isAddressValid=false;
boolean isGenderValid=false;
boolean isContactNoValid=false;
boolean isOccupationValid=false;
boolean isAdharNoValid=false;
boolean istypeOfDiseaseValid=false;
boolean isTokenNoValid=false;

        if(patientName!=null){
			name=patientName;
			isPatientNameValid=true;
		}else{
			System.out.println("Please Provide valid Patient Name");
		}
		
		if(dob!=null){
		   birthDate=dob;
		   isDobvalid=true;
		}else{
			System.out.println("Please Provide valid date of Birth of the Patient ");
		}
		
		if(age>0){
			ageOfPatient=age;
			isAgevalid=true;
		}else{
			System.out.println("Please Provide valid Age of the Patient ");
		}
		
		if(address!=null){
			 add=address;
			 isAddressValid=true;
		}else{
			System.out.println("Please Provide valid Address of the Patient ");
		}
		
		if(gender!=null){
			gen=gender;
			isGenderValid=true;
		}else{
			System.out.println("Please Provide valid gender of the Patient ");
		}
		
		if(contactNo>0){
			contactNum=contactNo;
			isContactNoValid=true;
		}else{
			System.out.println("Please Provide valid Contact Number of the Patient ");
		}
		
		if(occupation!=null){
			occup=occupation;
			isOccupationValid=true;
		}else{
			System.out.println("Please Provide valid occupation of the Patient ");
		}
		
		if(adharNo>0){
			 adharNum=adharNo;
			 isAdharNoValid=true;
		}else{
			System.out.println("Please Provide valid adhar Number of the Patient ");
		}
		
		if(typeOfDisease!=null){
			diseaseName=typeOfDisease;
			istypeOfDiseaseValid=true;
		}else{
			System.out.println("Please Provide valid Type of the Disease Patient ");
		}
			
		if(tokenNo>0){
			 token=tokenNo;
			 isTokenNoValid=true;
		}else{
			System.out.println("Please Provide valid Token Number ");
		}
		 
 
return isPatientRegistered;
}

public static void fetchPatientDetails(){

System.out.println("The Patient Name is:"+name);
System.out.println("The Date of Birth of the Patient is:"+birthDate);
System.out.println("The Age of the Patient is:"+ageOfPatient);
System.out.println("The Address of the Patient is:"+add);
System.out.println("The gender of the Patient is:"+gen);
System.out.println("The Contact Number of the Patient is:"+contactNum);
System.out.println("The Occupation of the Patient is:"+occup);
System.out.println("The Adhar Number of the Patient is:"+adharNum);
System.out.println("The Type of Disease found in the Patient is:"+diseaseName);
System.out.println("The Token Number of the patient is:"+token);
}
}