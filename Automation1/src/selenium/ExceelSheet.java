package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream excel=new FileInputStream("C:/Users/SONY/Desktop/excel sheet.xlsx");
		//predefined class ,create,getsheet are method;
		//sheet is interface of apache.poi;
		Sheet a =WorkbookFactory.create(excel).getSheet("Sheet1");
		
		String b=a.getRow(1).getCell(0).getStringCellValue();
		long c=(long) a.getRow(1).getCell(1).getNumericCellValue();
		
		Thread.sleep(4000);
		
	System.out.println(b);
	System.out.println(c);

	}

}
