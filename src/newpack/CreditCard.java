package newpack;

			//CreditCardPayment
class CreditCardPayment {
	public void makePayment(double amount) {
		System.out.println("Credit card payment of $" + amount + " processed.");
		}
	}

			//PayPalPayment
class PayPalPayment {
	public void makePayment(double amount) {
		System.out.println("PayPal payment of $" + amount + " processed.");
		}
	}

public class CreditCard {
	public static void main(String[] args) {
		CreditCardPayment creditPayment = new CreditCardPayment();
		creditPayment.makePayment(1000.0);
		PayPalPayment paypalPayment = new PayPalPayment();
		paypalPayment.makePayment(2000.0);
		}
	}
