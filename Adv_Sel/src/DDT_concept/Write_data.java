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

public class Write_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
      FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
      Workbook book=WorkbookFactory.create(fis);
      Sheet sh=book.getSheet("Sheet1");
      //Sheet sh = book.createSheet("Sheet");
      Row r=sh.createRow(0);
      Cell cel = r.createCell(1);
      cel.setCellValue("selenium");
      FileOutputStream fout= new FileOutputStream("./excel/Book1.xlsx");
      book.write(fout);
	}

}
