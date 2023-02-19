package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellsheet_Forloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream ex=new FileInputStream("C:/Users/SONY/Desktop/excel sheet.xlsx");
		
		Sheet a=WorkbookFactory.create(ex).getSheet("Sheet1");
		
		int rowno=a.getPhysicalNumberOfRows();
		
		
		for(int i=0;i<rowno;i++) 
		
		{
			
			int cellno=a.getRow(i).getPhysicalNumberOfCells();
			
				
			
			for(int j=0;j<cellno;j++)
			{
				
			String s=a.getRow(i).getCell(j).getStringCellValue();
			
				System.out.print(" "+s);
							
					}
		System.out.println();
		
		}
		
		
	}

}
