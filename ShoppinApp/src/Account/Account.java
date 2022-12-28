package Account;

public class Account {
	
		public  String accountHolderName;
		 public long accountNumber;
		 public double bankBal;
		public String Branch;
		public String ifsc;
		public static String bankName="Karnataka Bank";
		
		 public Account(String accountHolderName, long accountNumber, double bankBal, String branch, String ifsc) {
			super();
			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			this.bankBal = bankBal;
			Branch = branch;
			this.ifsc = ifsc;
		}
		public void deposit(double amount) {
			  if(amount>0) {
				  bankBal=bankBal+amount;
				  System.out.println(amount+" Deposited Succefully");
				  
			  }
		 }
		 public void withdraw(double amount) {
			 if(amount<bankBal) {
				 bankBal=bankBal-amount;
			 }
		 }
		 public void checkBalance() {
			 System.out.println("Bank Balance:"+bankBal);
		 }
		 
		 
		
}
