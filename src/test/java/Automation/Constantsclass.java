package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Constantsclass
{
	@Test
	public void ram() throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Properties prop=new Properties();
		String path="C:\\Users\\Dell\\eclipse-workspace1\\TestnNG\\src\\test\\resources\\constants";
		FileInputStream ra=new FileInputStream(path);
		prop.load(ra);
		String r1=prop.getProperty("appURL");
		String r2=prop.getProperty("userNAME");
		String r3=prop.getProperty("password");
		driver.get(r1);
		driver.findElement(By.name("email")).sendKeys(r1);
		driver.findElement(By.name("pass")).sendKeys(r2);
		driver.findElement(By.name("login")).click();
		
		
	}
	
	
	
	
	
	
	
}
