package DDT_concept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_multiple {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
     Workbook book=WorkbookFactory.create(fis);
     Sheet sh = book.getSheet("Facebook");
     int lr = sh.getLastRowNum();
     for(int i=0;i<=lr;i++)
     {
    	 Row r = sh.getRow(i);
    	 Cell cel = r.getCell(0);
    	 String value = cel.toString();
    	 System.out.print(i);
    	 System.out.println(value);
     }
	}

}
