package DDT_concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_data1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream fis=new FileInputStream("./excel/Testdata.xlsx");
     Workbook book = WorkbookFactory.create(fis);
     Sheet sh = book.createSheet("selenium");
     Row r = sh.createRow(0);
     Cell c = r.createCell(0);
     c.setCellValue("webdriver");
     FileOutputStream fout=new FileOutputStream("./excel/Testdata.xlsx");
     book.write(fout);
     
	}

}
