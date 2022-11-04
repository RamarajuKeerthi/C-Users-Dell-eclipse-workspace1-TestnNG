package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumporatice {

	public static void main(String[] args) {
		WebDriverManager . chromedriver().setup();
		ChromeDriver Driver= new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open chrome
		Driver.get("http://softwaretesting-guru.blogspot.com//p/blog-page.html");
		Driver.findElement(By.name("Name")).sendKeys("ramaraju");
		Driver.findElement(By.name("subscribe")).click();
		Driver.findElement(By.name("subscribe")).click();
		Driver.findElement(By.name("comments")).sendKeys("hi world");
		Driver.findElement(By.name("countries")).sendKeys("afganistan");
		Driver.findElement(By.name("center")).sendKeys("Hp");
		Driver.findElement(By.name("pwd")).sendKeys("123@rr");
	}

}
