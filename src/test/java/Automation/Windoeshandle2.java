package Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windoeshandle2
{
	@Test
	public void windoes()
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	// sync
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// Step1: Open application - citi.com
	driver.get("https://www.citi.com/credit-cards/compare/view-all-credit-cards");
	driver.findElement(By.linkText("Locations")).click();
	Set<String> ram=driver.getWindowHandles();
	List<String> raj=new ArrayList<String>(ram);
	String kr=raj.get(1);
	String rr=raj.get(2);
	
			
	
	}
}
 