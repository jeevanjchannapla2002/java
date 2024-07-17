.....................class AeroPlane{
	static int airLineId = 577004;
	static String airLineName = "Air India";
	static String source = "GATE-2";
	static String arrival = "18:00 01Dec2023" ;
	static String departure = "14:00 01Dec2023" ;
	static String pilotname = "Srivatsav" ;
	static int noOFSeats = 50 ;
	
	
	
	public static void main(String airport[]){
		System.out.println("AIRLINE ID:" + airLineId);
		System.out.println("FLYGT NAME: " + airLineName);
		System.out.println("GATE: " + source);
		System.out.println("DEPARTURE :" + departure);
		System.out.println("Arrival :" + departure);
		System.out.println("PIOLETNAME :" + pilotname);
		System.out.println("The No. of seats available :" + noOFSeats);
		
	}

}