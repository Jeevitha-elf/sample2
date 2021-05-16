import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericLibrary.ExcelLib;

public class Generic {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelLib lib= new ExcelLib();
		
		System.out.println(lib.excel("./resource/generic.xlsx","Sheet1",0,0));
		
		ExcelLib  lib1=new ExcelLib();
		System.out.println(lib1.excel1("./resource/generic.xlsx","Sheet1", 0, 1));
		
		ExcelLib  lib2=new ExcelLib();
		System.out.println(lib2.excel2("./resource/generic.xlsx","Sheet1", 0, 2));
		
		
	}
}
