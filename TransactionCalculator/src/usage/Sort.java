package usage;


import java.util.Collections;
import java.util.List;

import Report.RepAttribute;

public class Sort {

	public static List<RepAttribute> sort(List<RepAttribute> reportList) {
		// sort according to Client Id, Transaction Type, Transaction Date and
		// Priority.
		Collections.sort(reportList,
				(a, b) -> a.getClientId() != b.getClientId() ? Compare.compare(a.getClientId(), b.getClientId())
						: a.getTransactionType() != b.getTransactionType()
								? Compare.compare(a.getTransactionType(), b.getTransactionType())
								: a.getTransactionDate().equals(b.getTransactionDate()) == false
										? Compare.compare(a.getTransactionDate(), b.getTransactionDate())
										: Compare.compare(a.isPriority(), b.isPriority()));

		return reportList;
	}

}