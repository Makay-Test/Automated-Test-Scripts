package ui_Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_read {

	public static String[] user_accounts(int sheetnum, int rownum) throws IOException {

		String dataFilePath = ".\\datafiles\\data_file.xlsx"; // Declare the file path of the data file.
		FileInputStream readdatafile = new FileInputStream(dataFilePath); // Initialize the data file.
		XSSFWorkbook workbook = new XSSFWorkbook(readdatafile);
		XSSFSheet sheet = workbook.getSheetAt(sheetnum);
		String data[] = { "", "" };

		// Checking how many entries on the data sheet.
		int column = sheet.getRow(1).getLastCellNum();

		XSSFRow row = sheet.getRow(rownum);
		for (int c = 0; c < column; c++) {
			XSSFCell cell = row.getCell(c);
			data[c] = cell.getStringCellValue();
		}
		workbook.close();
		return data;
	}

}
