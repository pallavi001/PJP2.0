package ReaderWriter;


import java.util.List;

import Report.RepAttribute;

public class Write {

	public boolean writeFile(String outputFilePath , List<RepAttribute> reportList) {
		
		if(outputFilePath.contains(".csv"))
		{
			CSVFileWriter csvWriter = new CSVFileWriter();
			return csvWriter.writeCSV(outputFilePath, reportList);
		}
		
		return false;
		
	}

}