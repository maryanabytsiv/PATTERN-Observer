package main;

public class Client2 implements Client{

	@Override
	public void update(String massage) {
		System.out.println(massage + " from Client2");
	}

}
