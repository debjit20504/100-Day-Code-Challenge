public class CreditCard_test {
	public static void main(String[] args) {
		CreditCard wallet = new CreditCard[10];
		wallet[0] = new CreditCard("5391 0375 9387 5309", "Suraj Kumar", "SBI", 0.0, 2500);
		wallet[1] = new CreditCard("5391 0375 9387 1245", "Ram", "BOI", 0.0, 3500);
		wallet[2] = new CreditCard("6011 5309 0375 9569", "Sham", "PNB", 0.0, 5000);

		for(int i=0; i<16; i++) {
			wallet[0].chargeIt((double)i);
			wallet[1].chargeIt(2.0*i);
			wallet[2].chargeIt((double)3*i);
		}

		for (int i=0; i<3; i++) {
			CreditCard.printCard(wallet[i]);
			while(wallet[i].getBalance() > 100.0) {
				wallet[i].makePayment(100.0);
				System.out.println("New balance = "+wallet[i].getBalance());
			}
		}
	}
}

public class CreditCard {
	// Instance variables
	private String  number;
	private String name;
	private String bank;
	private double balance;
	private int limit;

	// Constructor
	CreditCard(String nb, String nm, String bk, double bal, int lmt) {
		number = nb;
		name = nm;
		bank = bk;
		balance = bal;
		limit = lmt;
	}

	// Accessor methods
	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getBank() {
		return bank;
	}

	public String getBalance() {
		return balance;
	}

	public String getLimit() {
		return limit;
	}

	// Action methods
	public boolean chargeIt(double price) {		// Make a charge
		if(price + balance > (double)limit) {
			return false;		// This is not enough money left to charge it
		}
		balance += price;
		return true; 		// The charge goes through in this case
	}

	public void makePayment(double payment) { 	// Make a payment
		balance -= payment;
	}

	public static void printCard(CreditCard c) { 	// Print a card's information 
		System.out.println("Number = "+c.getNumber());
		System.out.println("Name = "+c.getName());
		System.out.println("Bank = "+c.getBank());
		System.out.println("balance = "+c.getBalance());
		System.out.println("limit = "+c.getLimit());
	}
}