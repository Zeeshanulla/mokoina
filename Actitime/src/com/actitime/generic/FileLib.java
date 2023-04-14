package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


	
	/**
	 * this is a generic class for data driven testing
	 * @author Zeeshan
	 * 
	 */

	public class FileLib {
	/**
	 * this is a generic method for reading the data from property file
	 * @param Key
	 * @return
	 * @throws IOException 
	 * @throws IoExcepetion 
	 */
		public String getPropertyData(String key) throws IOException
		{
			FileInputStream fis=new FileInputStream("./data2/commondata.property");
					Properties p=new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		}
		/**
		 * this is  a generic method for reading the data from excel files
		 * @param sheetname
		 * @param row
		 * @param cell
		 * @return
		 * @throws IOException 
		 * @throws EncryptedDocumentException
		 * @throws {@link IOException}
		 */
	public String getExcelData(String sheetname,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data2/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

	/**
	 * this is a generic method for writing the data to excel file
	 * @param file
	 * @param  sheeetname
	 * @param row
	 * @param cell
	 * @param value
	 * @throws IOException 
	 * @throws EncryptedDocumentException
	 * @throws {@link IOException}
	 */
	public void setExceldata(String sheetname,int row,int cell,String value) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data2/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data2/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}
		
}
