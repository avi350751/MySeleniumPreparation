package readingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingFromExcel3 {
	
	
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
		int rowCount = wb.getSheet("Sample4").getPhysicalNumberOfRows();
		
		int column_count = wb.getSheet("Sample4").getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<rowCount;i++) {
			
			for(int j=0;j<column_count;j++) {
				String value = wb.getSheet("Sample4").getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				
				
			}
			
			System.out.println("********************************");
		}
		
		
		wb.close();
		
		
		
		
	}

}
