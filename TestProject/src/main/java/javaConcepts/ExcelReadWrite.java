package javaConcepts;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		//String Path="C:\\Users\\gokul.s05\\Downloads\\CLXExcelTemplateNew.xlsm";
		String Path="C:\\Users\\gokul.s05\\Downloads\\CLXExcelTemplateNew.xlsm";
		XSSFWorkbook Wbook= new XSSFWorkbook(Path);
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
				System.out.println(value);
			} 
		}
		Wbook.close();
	}

}
