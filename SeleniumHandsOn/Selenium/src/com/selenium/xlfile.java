package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\EclipseWorkplace\\SeleniumHandsOn\\OutPut\\output.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheetAt(0);
	
		XSSFCell dta=sheet.getRow(0).getCell(0);
		System.out.println("data is "+dta);

	}

}
