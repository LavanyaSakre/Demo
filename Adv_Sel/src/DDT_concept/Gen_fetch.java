package DDT_concept;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gen_fetch
{

	public static String getdata(String file_path, String sheetname,int row,int cell)
	{
     String value="";
	try
	{
		FileInputStream fis=new FileInputStream(file_path);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		Row r = sh.getRow(row);
		Cell cel = r.getCell(cell);
		value = cel.toString();
	}
	catch(Exception e)
	{
		System.out.println("file not found");
		e.printStackTrace();
	}
	return value;
  }
	public static void main(String[] args) {
		String val=getdata("./excel/Book1.xlsx", "Sheet1", 0, 0);
		System.out.println(val);
      
	}

}
