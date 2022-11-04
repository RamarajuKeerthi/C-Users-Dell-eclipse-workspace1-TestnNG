package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class friendclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open url
		driver.get("https://www.browserstack.com/");
		Actions ram= new Actions(driver);
		WebElement raju=driver.findElement(By.xpath("(//*[@aria-label='Products'])[1]"));
		ram.moveToElement(raju).perform();
		//click on iteam
		
		
		 WebElement  rr=driver.findElement(By.linkText("App Live"));
		 ram.moveToElement(rr);
		 ram.click().perform();
		//driver.findElement(By.id("signupModalButton")).click()
		//driver.findElement(By.xpath("(//*[@class='item-text'])[15]")).click();
		
	}

}
