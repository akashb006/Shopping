package DebitCard;
import java.util.Scanner;

import Account.Account;

public class DebitCard {
       int pinNumber;
       int cvv;
       String expDate;
       Account a1;
       Scanner sc = new Scanner(System.in);
	public DebitCard(int pinNumber, int cvv, String expDate, Account a1) {
		super();
		this.pinNumber = pinNumber;
		this.cvv = cvv;
		this.expDate = expDate;
		this.a1 = a1;
	}
       public void generatePin() {
    	   System.out.println("Enter New Pin:");
    	   int pin=sc.nextInt();
    	   System.out.println("Confirm New Pin:");
    	   int pinc=sc.nextInt();
    	   
    	   if(pin==pinc) {
    		   this.pinNumber=pin;
    		   System.out.println("Pin Generated Succefully!!");
    	   }else {
    		   System.out.println("Pin Mis Matching Please check!!!");
    	   }
    	   
       }
       public void updateDetails(int cvv, String expDate) {
    	   this.cvv=cvv;
    	   this.expDate=expDate;
    	   System.out.println("Updated Succefully");
       }
       public void onlinePayment(double productAmount,int pin) {
    	   if(pin==this.pinNumber) {
    		   if(a1.bankBal>productAmount) {
    			   a1.withdraw(productAmount);
    			   System.out.println("Payment Succefull and Order Placed");
    			   System.out.println("Thank You For Purchasing!!");
    		   }else {
    			   System.out.println("Insufficient Balance");
    		   }
    	   }else {
    		   System.out.println("Invalid Pin");
    	   }
       }
}
