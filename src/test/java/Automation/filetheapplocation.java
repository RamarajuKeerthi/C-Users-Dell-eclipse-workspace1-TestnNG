package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class filetheapplocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver=new ChromeDriver();
		//sync
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open url
		Driver.get("http://softwaretesting-guru.blogspot.com//p/blog-page.html");
		Driver.findElement(By.name("Name")).sendKeys("swami");
		Driver.findElement(By.name("subscribe")).click();
		Driver.findElement(By.name("subscribe")).click();
		Driver.findElement(By.name("comments")).sendKeys("love");
		WebElement ram=Driver.findElement(By.xpath("//*[@multiple='multiple']"));
		Select swami=new Select(ram);
		swami.selectByVisibleText("HP");
		swami.deselectByVisibleText("DELL");
		Driver.findElement(By.name("pwd")).sendKeys("111111111");
		Driver.findElement(By.name("rating")).click();
		Driver.findElement(By.xpath("(//*[@value='Submit'])[1]")).click();
		Alert s=Driver.switchTo().alert();
		s.accept();
	}

}
