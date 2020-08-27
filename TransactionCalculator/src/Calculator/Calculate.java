package Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Report.RepAttribute;
import Transaction.TransAttribute;
import Transaction.Type;
import usage.Date;
import usage.Rate;

public class Calculate {
	HashMap<String, TransAttribute> transactionMap = new HashMap<String, TransAttribute>();
	List<RepAttribute> reportList = new ArrayList<RepAttribute>();

	public List<RepAttribute> calculate(List<TransAttribute> transactionList) {

		for (TransAttribute transaction : transactionList) {
			String key = transaction.getClientId() + "_" + transaction.getSecurityId() + "_"
					+ transaction.getTransactionDate().toString();
			System.out.println(key);

			if (transactionMap.containsKey(key)) {
				TransAttribute previousTransaction = transactionMap.get(key);
				if (transaction.getType().equals(Type.SELL) && previousTransaction.getType().equals(Type.BUY)) {
					previousTransaction.setType(Type.INTRADAY);

				}

			} else {
				transactionMap.put(key, transaction);
			}
		}
		for (String key : transactionMap.keySet()) {

			TransAttribute transaction = transactionMap.get(key);
			System.out.println(transaction.getClientId());
			long clientId = transaction.getClientId();
			Type type = transaction.getType();
			Date transactionDate = transaction.getTransactionDate();
			boolean isPriority = transaction.isPriority();
			float processingFee = Rate.getRate(type, isPriority);
			RepAttribute reportItem = new RepAttribute(clientId, type, transactionDate, isPriority,
					processingFee);

			reportList.add(reportItem);
			
		}
		return reportList;
	}

}
