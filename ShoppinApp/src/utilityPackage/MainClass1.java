package utilityPackage;

import java.util.Scanner;

import Account.Account;
import DebitCard.Card;
import DebitCard.CreditCard;
import DebitCard.DebitCard;
import ShoppingApp.ShoppingApp;

public class MainClass1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account a1= new Account("Akash", 234566, 0.0, "Basavanagudi", "KARB0358");
		Card c1= new Card();
		DebitCard d1 = new DebitCard(1234, 113, "12/22", a1);
		CreditCard cr1= new CreditCard();
		
		ShoppingApp s1 = new ShoppingApp(1234, 113, "12/22", a1, "Mobile", 3500.0, "Jspider VVpuram Basavanagudi Bengalore"); 
			
		
		a1.deposit(15000);
		//s1.generatePin();
		s1.updateDetails(116, "12/27");
		s1.selectProduct("Mobile", 3500.0, "Jspider VVpuram Basavanagudi Bengalore");
		System.out.println("Select Payment Option:");
		System.out.println("1.Debit Card\n2.Credit Card");
		int option =sc.nextInt();
		
		if(option==1) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
			c1.onlinePayment(3500.0, 1234, d1);
		}else if(option==2) {
			c1.onlinePayment(3500.0, 4567, cr1);
		}else {
			System.out.println("Invalid Input");
		}
		
		cr1.checkBal();
		a1.checkBalance();
		System.out.println("After RePayment");
		cr1.makePayment(a1);
	
		a1.checkBalance();
		
		
		

	}

}
