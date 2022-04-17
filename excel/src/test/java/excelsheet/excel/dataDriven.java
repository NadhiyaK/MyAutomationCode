package excelsheet.excel;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(new File("//Users//nkarunakaran//Documents//Selenium//Git//EndtoEndAuto//demodata.xlsx"));
	//	FileInputStream fis = new FileInputStream("/Users/nkarunakaran/Documents/Selenium/Git/EndtoEndAuto/demodata.xlsx");
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		
	int sheetcount = workbook1.getNumberOfNames();
	
	for(int i =0; i<sheetcount; i++)
	{
		if(workbook1.getSheetName(i).equalsIgnoreCase("Sheet1"))
		{
			XSSFSheet sheet = workbook1.getSheetAt(i);
			Iterator<Row> it = sheet.rowIterator();
			Row firstrow = it.next();
			Iterator<Cell> cl = firstrow.cellIterator();
			while (cl.hasNext())
			{
				Cell value = cl.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
				{
					System.out.println(value.getStringCellValue());
				}
			}
		}
		
	}
	workbook1.close();
	fis.close();
		
	}

}
