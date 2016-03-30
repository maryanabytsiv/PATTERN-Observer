package main;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> listOfClients = new ArrayList<>();
	
	void addClient(Client c){
		listOfClients.add(c);
	}
	
	void sendMassage(String massage){
		System.out.println(massage);
	}
	
	void notify(String msg){
		for (Client client : listOfClients) {
			client.update(msg);
		}
	}

}
