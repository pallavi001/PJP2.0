package usage;
import Transaction.Type;

public class Rate {


	

	public static float getRate(Type type, boolean isPriority) {
		// TODO Auto-generated method stub
		String key = "";
		if(isPriority == true)
			key = "high";
		else
			key = type.toString();
		if(Transaction.Rate.rates.containsKey(key))
			return Transaction.Rate.rates.get(key);
		
		return (float) 0.0;
	}

}
