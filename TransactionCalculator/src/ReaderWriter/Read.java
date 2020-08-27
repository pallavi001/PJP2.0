package ReaderWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Transaction.TransAttribute;


public class Read {

	public List<TransAttribute> readFile(String path) {
		// TODO Auto-generated method stub

		List<TransAttribute> transactionList = new ArrayList<TransAttribute>();
		if (path.contains(".csv")) {
			CSVFileReader csvReader = new CSVFileReader();
			try {
				transactionList = CSVFileReader.readCSV(path);

				// ***********************************************//
				System.out.println("From Reader");
				TransAttribute temp = transactionList.get(0);
				System.out.println(">  " + temp.toString());

				// ***********************************************//

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return transactionList;
	}

}
