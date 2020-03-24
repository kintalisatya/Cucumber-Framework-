package com.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CrosswordExcel 
{

	//To read and return the username
	public  String excel_username(int a) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\Testdata\\testdata.xlsx")); //Create an object of File class to open xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fil);  //Create an object of FileInputStream class to read excel file
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		System.out.println(count);	    
		XSSFRow row =sheet.getRow(a);
		XSSFCell cell=row.getCell(0);
		String un=cell.getStringCellValue();
							  
		return un;
	}
					
	//To read and return the password
	public  String excel_password(int b) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\Testdata\\testdata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		XSSFRow row =sheet.getRow(b);
		XSSFCell cell1=row.getCell(1);
		String pwd=cell1.getStringCellValue();
				          
		return pwd;
	}
}
