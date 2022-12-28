package DebitCard;

public class Card {
 public void  onlinePayment(double amt, int pin, DebitCard d1) {
	 d1.onlinePayment( amt, pin);
 }
 public void  onlinePayment(double amt, int pin, CreditCard c1) {
	 c1.onlinePayment( amt, pin);
 }
}
