package readingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingFromExcel {
	
	
	/*
	 * XSSFWorkbook -- Workbook
	 * XSSFSheet -- Sheet
	 * XSSFRow -- Rows
	 * XSSFCell -- Columns
	 * 
	 */
	
	@Test
	public void readExcel() throws IOException {
		
		/*Step 1 - Locate the file*/
		File src = new File("/Users/obhi/Downloads/ReadFromExcel.xlsx");
		System.out.println(src.exists());
		
		/*Step 2- Convert into raw stream*/
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int count = wb.getNumberOfSheets();
		System.out.println("Number of sheets: "+count);
		
		XSSFSheet sh1 = wb.getSheet("Sample1");
		
		XSSFRow r1 = sh1.getRow(1); 
		
		XSSFCell c1 = r1.getCell(1);
		String value = c1.getStringCellValue();
		
		System.out.println(c1);
		System.out.println(value);
		
		wb.close();
		
		
		
		
	}

}
