package main;

public class Client1 implements Client{

	@Override
	public void update(String massage) {
		System.out.println(massage + " from Client1");
	}

}
