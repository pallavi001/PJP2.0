package com.sapient.income;

import java.io.IOException;

public class IncomeRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String csvFile = "F:\\Publicis Sapient\\PJP2.0\\PJP2_Week2\\Income_Assignment\\Incomes.csv";
	       CSVFileReader.read(csvFile);
	       OutTableGenerate.printLog();;
	}

}
