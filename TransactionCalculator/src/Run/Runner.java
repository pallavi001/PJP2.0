package Run;

import java.util.ArrayList;
import java.util.List;

import Calculator.Calculate;
import ReaderWriter.Read;
import usage.Sort;
import ReaderWriter.Write;
import Report.RepAttribute;
import Transaction.TransAttribute;

public class Runner {

	final static String inputFilePath = "F:\\Publicis Sapient\\PJP2.0\\PJP2_Week2\\Transactions.csv";
	final static String outputFilePath = "F:\\Publicis Sapient\\PJP2.0\\PJP2_Week2\\Output.csv";
	static List<RepAttribute> reportList = new ArrayList<RepAttribute>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Read the file
		Read reader = new Read();
		List<TransAttribute> transactionList = new ArrayList<TransAttribute>();
		transactionList = reader.readFile(inputFilePath);

		// 2. process the transactions

		Calculate feeCalculator = new Calculate();
		reportList = feeCalculator.calculate(transactionList);
		
		// 3. sort according to Client Id, Transaction Type, Transaction Date and Priority.
		
		reportList = Sort.sort(reportList);
		System.out.println(reportList.get(0).toString());
		
		// 4. write to output file

		Write writer = new Write();

		boolean result = writer.writeFile(outputFilePath, reportList);

		if (result == true)
			System.out.println("Success");
		else
			System.out.println("Failed");
	}


}
