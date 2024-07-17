class Factorial{
		// purpose
public static int toGetFact(int factNumber){
	System.out.println("fact method started");
	
	for(int num = 1 ; num <= factNumber ; num++ ){
		fact = num*fact;
		System.out.println(fact);
	}
	System.out.println("fact mathod ended");
	
	return fact;
}
}