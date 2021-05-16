package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	public double excel(String abstractpath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis = new FileInputStream(abstractpath);
	Workbook book = WorkbookFactory.create(fis);
	double nc=book.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
	return nc;
	}
	public String excel1(String abstractpath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(abstractpath);
		Workbook book = WorkbookFactory.create(fis);
		String name=book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return name;
	}
	
	public boolean excel2(String abstractpath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(abstractpath);
		Workbook book = WorkbookFactory.create(fis);
		boolean b=book.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return b;
		
	}
    public Date excel3(String abstractpath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(abstractpath);
		Workbook book = WorkbookFactory.create(fis);
		Date date=book.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return date;
    }
     public String[][] multipleDataReading(String abstractpath, String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
    	 FileInputStream fis = new FileInputStream(abstractpath);
 		  Workbook wb= WorkbookFactory.create(fis);
         int rowcount = wb.getSheet("Sheet1").getPhysicalNumberOfRows();
 		int cellcount = wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
 		String [][] arr=new String[rowcount][cellcount];
 		for(int i=0;i<rowcount;i++) {
 			for(int j=0;j<cellcount;j++) {
 				arr[i][j] =wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
 				
 			}
 }
	
	return arr;
	}
}
