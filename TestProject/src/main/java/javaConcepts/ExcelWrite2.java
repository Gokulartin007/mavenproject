package javaConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite2 {

	public static void main(String[] args) throws IOException {
		String Path="C:\\Users\\gokul.s05\\Downloads\\CLXExcelTemplateNew.xlsm";
		FileInputStream ex= new FileInputStream(Path);
		XSSFWorkbook Wbook= new XSSFWorkbook(ex);
		XSSFSheet sheet= Wbook.getSheetAt(0);
		int lastrow=sheet.getLastRowNum();//will not include header row
		int noofrows=sheet.getPhysicalNumberOfRows();//will include header row
		System.out.println(noofrows);
		short lastCell=sheet.getRow(0).getLastCellNum();
		System.out.println(lastCell);


		for (int i = 0; i < lastrow; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCell; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dt= new DataFormatter();
				String value =dt.formatCellValue(cell);
				//String value = cell.getStringCellValue(); return nly string if numb present then throw error 
				//double value2 = cell.getNumericCellValue(); //return nly numb if string present then throw error 
				System.out.println(value);
			} 
		}

		sheet.getRow(0).createCell(lastCell-1).setCellValue("Gokul");

		FileOutputStream out= new FileOutputStream(Path);
		Wbook.write(out);

		Wbook.close();
	}

}
