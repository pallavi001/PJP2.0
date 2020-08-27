package ReaderWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import Report.RepAttribute;
import usage.Date;

public class CSVFileWriter {

	private String clientId = "CLIENT ID";
	private String transactionType = "TYPE";
	private String transactionDate = "DATE";
	private String isPriority = "PRIORITY";
	private String processingFee = "PROCESSING FEE";
	private final String currency = "$";
	public  boolean writeCSV(String outputFilePath, List<RepAttribute> reportList) {
		try {
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
			CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(clientId, transactionDate,
					transactionType, isPriority, processingFee));

			for (RepAttribute item : reportList) {
				System.out.println(item);
				long itemClientId = item.getClientId();
				String itemTransactionType = item.getTransactionType().toString();
				Date itemTransactionDate = item.getTransactionDate();
				boolean itemIsPriority = item.isPriority();
				String itemProcessingFee = currency + Float.toString(item.getProcessingFee());
				System.out.println(itemTransactionType);
				csvPrinter.printRecord(itemClientId, itemTransactionDate, itemTransactionType, itemIsPriority,
						itemProcessingFee);
			}

			csvPrinter.flush();

		}

		catch (IOException e) {
			return false;
		}

		return true;

	}
}
