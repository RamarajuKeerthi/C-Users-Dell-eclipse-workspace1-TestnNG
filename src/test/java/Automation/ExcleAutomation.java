package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcleAutomation 
{
	@Test
	public void excle() throws EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("https://www.amazon.com/");
		String path="C:\\Users\\Dell\\eclipse-workspace1\\TestnNG\\src\\test\\resources\\Excle.xlsx";
		FileInputStream rr=new FileInputStream(path);
		Workbook ra= WorkbookFactory.create(rr);
		Sheet ram=ra.getSheet("rama");
		int count=ram.getPhysicalNumberOfRows();
		for(int i=0;i<count;i++)
		{
			String raju=ram.getRow(i).getCell(0).getStringCellValue();
			WebElement swami=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
			swami.clear();
			swami.sendKeys(raju);
			swami.submit();
		}
	}
}
