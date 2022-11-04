package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousemove2 
{
     @Test 
	public void facebook()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open url
		driver.get("https://www.ajio.com/");
		Actions ram=new Actions(driver);
		WebElement raj=driver.findElement(By.xpath("//*[@href='/shop/men']"));
		ram.moveToElement(raj).perform();
		driver.findElement(By.linkText("Jeans")).click();
		driver.findElement(By.xpath("(//*[@class='facet-left-pane-label'])[3]")).click();
		//driver.findElement(By.xpath("(//*[@class='facet-linkhead'])[3]")).click();
		driver.findElement(By.name("minPrice")).sendKeys("1000");
		driver.findElement(By.name("maxPrice")).sendKeys("5000");
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
	}

}
