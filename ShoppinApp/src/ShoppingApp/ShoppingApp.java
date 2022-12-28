package ShoppingApp;

import Account.Account;
import DebitCard.DebitCard;

public class ShoppingApp extends DebitCard {
    String productName;
    double productPrice;
    String ShippingAddress;
	
	public ShoppingApp(int pinNumber, int cvv, String expDate, Account a1, String productName, double productPrice,
			String shippingAddress) {
		super(pinNumber, cvv, expDate, a1);
		this.productName = productName;
		this.productPrice = productPrice;
		ShippingAddress = shippingAddress;
	}
	public void selectProduct(String productName, double productPrice,String shippingAddress) {
		if(this.productName.equals(productName) && this.productPrice==productPrice && this.ShippingAddress.equals(shippingAddress) ) {
			System.out.println(" Product Selected buy now ");
		}
	}
    
}
