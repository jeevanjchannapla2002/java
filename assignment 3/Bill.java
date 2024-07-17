class Bill{

	static int billd = 101;
	static String billIssuedDate="12/06/2024";
	static String billDueDate="26/06/2023";
	static boolean isBillPaid=false;
	static boolean isLatestBill=true;
	
	
	
public static void main(String jioBill[]){
	System.out.println("------------");
	System.out.println("The Bill Id is:" + billd);
	System.out.println("The Bill is Issued On:" + billIssuedDate);
	System.out.println("The Bill Due Date is:" + billDueDate);
    System.out.println(isLatestBill);
	System.out.println(isBillPaid);
	}
}