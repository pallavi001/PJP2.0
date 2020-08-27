package ReaderWriter;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


import Transaction.TransAttribute;

public class CSVFileReader {
	static List<TransAttribute> transactionList = new ArrayList<TransAttribute>();

	public static List<TransAttribute> readCSV(String path) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(path));
		CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

		for (CSVRecord csvRecord : csvParser) {
			String attributeName = csvRecord.get(0);
			String externalTransactionId = csvRecord.get(1);
			String clientId = csvRecord.get(2);
			String securityId = csvRecord.get(3);
			String transactionDate = csvRecord.get(4);
			String type = csvRecord.get(5);
			String marketValue = csvRecord.get(6);
			String isPriority = csvRecord.get(7);
			transactionList.add(new TransAttribute(attributeName, externalTransactionId, clientId, securityId,
					transactionDate, type, marketValue, isPriority));

		}

		return transactionList;

	}
}