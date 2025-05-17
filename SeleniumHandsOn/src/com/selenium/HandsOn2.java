package com.selenium;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;



public class HandsOn2 {
	
	public static void m1(String s)
	{
		System.out.println("m1");
	}
	
	static void m1 (Object o)
	{
		System.out.println("m2");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		HandsOn2.m1(null);
		
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkplace\\SeleniumHandsOn\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.geeksforgeeks.org/");
	       
		//Java script executor
		 WebElement el= driver.findElement(By.id("Data Structures"));
		  
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	js.executeScript("arguments[0],click();", el);
	
		
	
	      
	      
	       
	       Thread.sleep(3000);

	        driver.navigate().back();
	        Thread.sleep(3000);
		
	//driver.switchTo().frame("iframe");
	driver.findElement(By.xpath("//span[contains(text(),\"Linux\")]")).click();
	
	Set<String> handles=driver.getWindowHandles();
	
	for(String hndle:handles)
		
	{
		
		String web=driver.switchTo().window(hndle).getTitle();	
		
	
		if(web.contains("Linux"))
		{
			//driver.switchTo().window(hndle).getTitle();	
			System.out.println(web);
		Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),\"Kali Linux\")]")).click();
			
		}
		
		else {System.out.println("window not found");}
//		
		
		
	}
	
	
	
	

	}

}
