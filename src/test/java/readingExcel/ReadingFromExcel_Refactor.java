package readingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingFromExcel_Refactor {
	
	
	/*
	 * XSSFWorkbook -- Workbook
	 * XSSFSheet -- Sheet
	 * XSSFRow -- Rows
	 * XSSFCell -- Columns
	 * 
	 */
	
	@Test
	public void readExcel() throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File("/Users/obhi/Downloads/ReadFromExcel.xlsx")));
		int count = wb.getNumberOfSheets();
		System.out.println("Number of sheets: "+count);
		
		System.out.println(wb.getSheet("Sample1").getRow(0).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sample1").getRow(0).getCell(1).getStringCellValue());
		System.out.println(wb.getSheet("Sample1").getRow(0).getCell(2).getStringCellValue());
		System.out.println(wb.getSheet("Sample1").getRow(0).getCell(3).getNumericCellValue());
		
		System.out.println(wb.getSheet("Sample2").getRow(0).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sample2").getRow(0).getCell(1).getStringCellValue());
		System.out.println(wb.getSheet("Sample2").getRow(1).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sample2").getRow(1).getCell(1).getStringCellValue());
		
		
		System.out.println(wb.getSheet("Sample3").getRow(0).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sample3").getRow(0).getCell(1).getStringCellValue());
		System.out.println(wb.getSheet("Sample3").getRow(0).getCell(2).getNumericCellValue());
		System.out.println(wb.getSheet("Sample3").getRow(1).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("Sample3").getRow(1).getCell(1).getStringCellValue());
		wb.close();
		
		
		
		
	}

}
