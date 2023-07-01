package testngPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {
	
	public static String[][] loginFromExcelData() throws Exception {
		
		File file=new File("./DataFolder/dataSheet.xlsx");
		FileInputStream io=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(io);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		int rowWithHeader=sheet.getPhysicalNumberOfRows();
		short col=sheet.getRow(0).getLastCellNum();
		System.err.println("total number of rows with header:"+rowWithHeader);
		System.out.println("total number of data rows & column:"+rows+"*"+col);
		
		String[][] data=new String[rows][col];
		for (int i = 1; i <=rows; i++) {
			XSSFRow row=sheet.getRow(i);
			for (int j = 0; j <col; j++) {
				XSSFCell cell= row.getCell(j); 
				DataFormatter dt=new DataFormatter();
				String value= dt.formatCellValue(cell);
				data[i-1][j]=value;
			}
			
		}
		wb.close();
		return data;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		
		String[][] data=loginFromExcelData();
		System.out.println(data[0]);
		
		
	}

}
