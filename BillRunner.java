class BillRunner{
	public static void main(String[]generateBill){
		// ClassName ref =newClassName();
		Bill bill = new Bill();
		bill.billId=52;
		bill.billIssueDate= "17-Jun-2024";
		bill.billDueDate= "24-Jun-2024";
		System.out.println("the Bill Id is " +bill.billId);
		System.out.println("the Bill Issue Date is " +bill.billIssueDate);
		System.out.println("the Bill Due Date is " +bill.billDueDate);
		Bill bill1 = new Bill();
		bill1.billIssueDate= "17-Jun-2024";
		System.out.println("the Bill Issue Date is " +bill1.billIssueDate);
	}
}