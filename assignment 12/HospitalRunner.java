class HospitalRunner{
public static void main(String hospital[]){


boolean isPatientRegistered= Hospital.registerPatient("Jeevan J C","13/10/2002",22,"Bengaluru","Male",
8867397004L,"SoftwareTrainee",529725299980L,"Fever",56);


 if(isPatientRegistered=true){
	    Hospital.fetchPatientDetails();  
	 }
		 else{
			 System.out.println("Please Provide valid Candidate Details......");
		 }
}
}	 

