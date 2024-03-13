package DDT_concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
	      Workbook book=WorkbookFactory.create(fis);
	      Sheet sh=book.getSheet("Facebook");
	      System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com");
	      List<WebElement> links = driver.findElements(By.xpath("//a"));
	      int count = links.size();
	      System.out.println(count);
	      for(int i=0;i<count;i++)
	      {
	    	WebElement link=links.get(i);
	    	String attr = link.getAttribute("href"); 
	    	Row r = sh.createRow(i);
	    	Cell cel = r.createCell(0);
	    	cel.setCellValue(attr);
	      }
	      FileOutputStream fout=new FileOutputStream("./excel/Book1.xlsx");
	      book.write(fout);
	}

}
