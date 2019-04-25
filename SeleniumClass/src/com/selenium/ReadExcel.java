package com.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("ss.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(1);
		Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
		FileOutputStream fos=new FileOutputStream("ss.xlsx");
		Row r1=s.createRow(3);
		Cell c1=r1.createCell(0);
		c1.setCellValue("Satish");
		wb.write(fos);
		fos.close();
		
		
	}

}
