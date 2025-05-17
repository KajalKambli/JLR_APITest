package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testtravel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkplace\\SeleniumHandsOn\\Resources\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1ek1ggs']")).sendKeys("New York");
		
		
		// TODO Auto-generated method stub

	}

}
