package datatestcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC_01 {
	
	public Object[][] readExcel1() throws IOException
	{
		File file=new File("D:\\Keyword.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalColums=sheet.getRow(0).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalColums);
		
		Object obj[][]=new Object[totalRows][totalColums];
		for(int i=0;i<totalRows;i++){
			Row row = sheet.getRow(i+1);
			for(int j=0;j<totalColums;j++) {
				Cell cell = row.getCell(j);
				String value = cell.toString();
				obj[i][j]=value;
			}
		}
		return obj;	
		
	}
}
