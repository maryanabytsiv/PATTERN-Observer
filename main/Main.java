package main;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addClient(new Client1());
		bank.addClient(new Client2());
		
		bank.notify("New msg");
	}
}
