package utils;

import org.testng.annotations.DataProvider;

import testngPack.ReadExceldata;

public class DataUtils {

	//this takes data from below code
	@DataProvider(name="Utilslogin" ,indices = {1,2}, parallel = true)
	public String[][] LoginData() {
		String[][] data=new String[3][2];
		data[0][0]="Gokulartin007@gmail.com";
		data[0][1]="465850071";
		data[1][0]="Gokulartin007@gmail.com";
		data[1][1]="4658500711";
		data[2][0]="Gokulartin007@gmail.com";
		data[2][1]="4658";
		return data;
	}
	
	
	//this takes data from the external file i.e excel
	@DataProvider(name="excelLogin")
	public String[][] ExcelLoginData() throws Exception {
		
		String[][] data=ReadExceldata.loginFromExcelData();
		
		return data;
	}
	
	
	
}
