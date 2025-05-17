package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class HandsOn {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkplace\\SeleniumHandsOn\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//take screenshot 
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\EclipseWorkplace\\SeleniumHandsOn\\OutPut\\screenshot.png"));
		
		//
		FileInputStream file=new FileInputStream("C:\\EclipseWorkplace\\SeleniumHandsOn\\OutPut\\output.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheetAt(0);
	
		XSSFCell dta=sheet.getRow(0).getCell(0);
		System.out.println("data is "+dta);
	
		
		
		
		
		//Wait1
		Thread.sleep(200);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("//a[@data-cy='home-hero-pricing']")));

		//Declare and initialize a fluent wait
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		//Specify the timeout of the wait
		wait1.withTimeout(Duration.ofSeconds(20));
		//Specify polling time
		wait1.pollingEvery(Duration.ofSeconds(20));
		//Specify what exceptions to ignore
		wait1.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		wait1.until(ExpectedConditions.alertIsPresent());
		
		driver.findElement(By.xpath("//a[@data-cy='home-hero-pricing']")).click();
		
		Actions ac=new Actions(driver);
		
//		ac.keyDown(element, f)); 
		// TODO Auto-generated method stub

	}

}
