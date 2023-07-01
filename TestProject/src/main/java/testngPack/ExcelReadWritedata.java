package testngPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWritedata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file=new File("./DataFolder/dataSheet.xlsx");
		FileInputStream io=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(io);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		int rowWithHeader=sheet.getPhysicalNumberOfRows();
		short col=sheet.getRow(0).getLastCellNum();
		System.err.println("total number of rows with header:"+rowWithHeader);
		System.out.println("total number of data rows & column:"+rows+"*"+col);
		for (int i = 1; i <=rows; i++) {
			XSSFRow row=sheet.getRow(i);
			DataFormatter dt=new DataFormatter();
				String col1= row.getCell(0).getStringCellValue();//will return the string value 
				String col2= dt.formatCellValue(row.getCell(1));//it will convert the int data type into string and return
				System.out.println( col1 +" "+col2);
			
		}
		
		sheet.getRow(0).createCell(col+1).setCellValue("status");
		FileOutputStream op=new FileOutputStream(file);
		wb.write(op);
		
		wb.close();
	}

}
