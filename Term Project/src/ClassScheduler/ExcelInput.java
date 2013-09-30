package ClassScheduler;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelInput {
	private String[][] outputArray;
	private String inputFile;

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public void read() throws IOException  {
		File inputWorkbook = new File(inputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(5);
			// Loop over first 10 column and lines
      
			int columnCount = sheet.getColumns();
			int rowCount = sheet.getRows();
      
			outputArray = new String[columnCount][rowCount];

			for (int j = 0; j < rowCount; j++)
				try {
					for (int i = 0; i < columnCount; i++) {
						Cell cell = sheet.getCell(i, j);
						outputArray[i][j]=cell.getContents();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}
	
	public int rowCount(){
		return outputArray[0].length;
	}
	
	public void printSpreadsheet(){
		for(int i=0;i<outputArray[0].length;i++){
			for(int j=0;j<outputArray.length;j++){
				System.out.print(outputArray[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public String[] passRow(int row){
		String[] result = new String[6];
		for(int i=0;i<6;i++){
			result[i]=outputArray[i][row];
		}
		return result;
	}
} 