package TestNGparameters;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.ExcelLib;

public class UingDataProvider {
	@DataProvider()
	public String[][] testData() throws EncryptedDocumentException, IOException {
		ExcelLib lib= new ExcelLib();
		String[][] a = lib.multipleDataReading("./resource/Book1.xlsx"," Sheet1", 0, 0);
		String sar[][]= a;

		return sar;
	}

	@Test(dataProvider="testData")
	public void sample1(String[] data) {
		for(String s:data) {
			Reporter.log(s,true);
		}
	}
}
