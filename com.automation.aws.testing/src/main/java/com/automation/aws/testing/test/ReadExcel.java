package com.automation.aws.testing.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcel {
			
	
	
	@Test
	public  void readExcel() throws Exception {
		System.out.println("Running");
	try {
		File src = new File("./Extent-Report/IOFile.xlsx");
		FileInputStream input = new FileInputStream(src); 
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
	
System.out.println("Data is "+sheet.getRow(0).getCell(0).getStringCellValue());
System.out.println("Data is "+sheet.getRow(0).getCell(1).getStringCellValue());
	}
	
	catch(Exception e){
		System.out.println("File not Found");
	}
	}	
	
}
