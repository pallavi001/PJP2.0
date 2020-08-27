package usage;
import Transaction.Type;

public class Compare {

	public static int compare(long clientId1, long clientId2) {

		if (clientId1 >= clientId2)
			return 1;
		return -1;
	}

	public static int compare(Type type1, Type type2) {

		return type1.compareTo(type2);

	}

	public static int compare(Date transactionDate1, Date transactionDate2) {

		if (transactionDate1.getYear() != transactionDate2.getYear())
			return transactionDate1.getYear() - transactionDate2.getYear();
		else if (transactionDate1.getMonth() != transactionDate2.getMonth())
			return transactionDate1.getMonth() - transactionDate2.getMonth();
		return transactionDate1.getDay() - transactionDate2.getDay();
	}

	public static int compare(boolean priority1, boolean priority2) {
		
		if(priority1 == true)
			return 1;
		
		return -1;
	}

}