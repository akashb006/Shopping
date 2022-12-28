package DebitCard;

import Account.Account;

public class CreditCard {
 double creditBal=40000.0;
 int pinNumber= 4567;
 
 public void onlinePayment(double productAmount,int pin) {
	   if(pin==this.pinNumber) {
		   if(creditBal>productAmount) {
			   withdraw(productAmount);
			   
			   System.out.println("Payment Succefull and Order Placed");
			   System.out.println("Thank You For Purchasing!!");
		   }else {
			   System.out.println("Insufficient Balance");
		   }
	   }else {
		   System.out.println("Invalid Pin");
	   }
 }
 public void withdraw(double amt) {
	 if(amt<creditBal) {
		 creditBal=creditBal-amt;
	 }
 }
 public void makePayment(Account a1) {
	 double bal=40000.0-creditBal;
	 a1.withdraw(bal);
	 System.out.println("Repayment Succefull!");
	 creditBal=40000.0;
	 System.out.println("Updated Credit Card Balance:"+creditBal);
	 
 }
 public void checkBal() {
	 System.out.println("Credit Card Balance: "+creditBal);
 }
}
