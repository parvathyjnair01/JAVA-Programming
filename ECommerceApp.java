package javaLab;

class PaymentGateway {
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Credit card payments");
		System.out.println("Payment successful using card" + cardNumber);
	}
	public void makePayment(String upID) {
		System.out.println("UPI Payments");
		System.out.println("Payment successful via UPI ID" + upID);
	}
	public void makePayment(double amount) {
		System.out.println("Cash on delivery");
		System.out.println("Payment successful");
	}
	
}

public class ECommerceApp {
	public static void main(String [] args) {
		PaymentGateway p1=new PaymentGateway();
		p1.makePayment("2521558645","25/02/25","555");
		p1.makePayment("5252");
		p1.makePayment(25.2);
	}

}
