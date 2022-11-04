package Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windoeshandle
{
	@Test
	public void windoes()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step1: Open application - citi.com
		driver.get("https://www.citi.com/credit-cards/compare/view-all-credit-cards");
		driver.findElement(By.linkText("Locations")).click();
		Set<String> ram= driver.getWindowHandles();
			System.out.println(ram);
		//set change to list
		List<String> raju= new ArrayList<String>(ram);
		String mainwindoes=raju.get(0);
		String newnwindoes=raju.get(1);
		driver.switchTo().window(mainwindoes);
		driver.switchTo().window(newnwindoes);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
	}
}
