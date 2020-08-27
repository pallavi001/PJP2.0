package Transaction;


import java.util.HashMap;

public class Rate {

	/*
	 * 1. high priority, any = $500
	 * 2. normal priority, buy = $50
	 * 3. normal priority, sell = $100
	 * 4. normal priority, deposit = $50
	 * 5. normal priority, withdraw = $100
	 */
	
	public static HashMap<String, Float> rates = new HashMap<String, Float>();
	static {
		rates.put("high" , (float) 500.0);
		rates.put("BUY" , (float) 50.0);
		rates.put("SELL" , (float) 100.0);
		rates.put("DEPOSIT" , (float) 50.0);
		rates.put("WITHDRAW" , (float) 100.0);
		rates.put("INTRADAY" , (float) 10.0);
		
	}
	
	
}