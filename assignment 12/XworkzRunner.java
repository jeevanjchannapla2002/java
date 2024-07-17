class XworkzRunner{
public static void main(String institute[]){

   boolean isTraineeRegistered = Xworkz.registerTrainee("Jeevan J C","4GM20CS045","GM Institute of Technology",
                           "13/10/2002",8867397004L,"jeevanjcklb2002@gmail.com",7.80);

	
	 
	 if(isTraineeRegistered=true){
	      Xworkz.getTraineeDetails();
	 }
		 else{
			 System.out.println("Please Provide valid Candidate Details......");
		 }
}
}	 