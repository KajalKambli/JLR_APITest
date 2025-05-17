package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
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
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;



public class HandsOn3 {
	
static String prc;
static int price;
static String iphone;

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("C:\\Users\\Kajal Kambli\\Desktop\\Kajal\\Selenium setup\\Output.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkplace\\SeleniumHandsOn\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	       Thread.sleep(3000);

	      
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> pr=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	List<WebElement> IphoneNames=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	
	try {
		
		for(int i=0;i<IphoneNames.size();i++) {
			
			 iphone=IphoneNames.get(i).getText();
			 prc=pr.get(i).getText().replaceAll("[^0-9]", "");
			 price=Integer.parseInt(prc);
		
			
			
		if(price>=65000 && price<=100000)
			
		{
			hm.put(iphone, price);
			
			
			
			Row row=sheet.createRow(i);
			row.createCell(0).setCellValue(iphone);
			row.createCell(1).setCellValue(price);
			FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Kajal Kambli\\Desktop\\Kajal\\Selenium setup\\Output.xlsx");
		
	            wb.write(outputStream);
		}
		}
				
	hm.forEach((k,v)->System.out.println(k+" Buy with price: "+v));
	System.out.println("count of mobile:  "+hm.size());
	
	
	
	for(Map.Entry<String, Integer> entry:hm.entrySet())
	{
		
		
	}
	
	}
	
	catch(NumberFormatException e)
	{
		System.out.println("Number is wrong");
	}

driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();

String parentwindow=driver.getWindowHandle();
Set<String> windows=driver.getWindowHandles();

for(String window:windows)
	
{
	if(parentwindow.equals(window))
	{}
	
	else
	{
		
		driver.switchTo().window(window);
	}	
	
	
}

Thread.sleep(5000);
driver.findElement(By.xpath("//div[contains(text(),\"Buy without Exchange\")]")).isDisplayed();

System.out.println("Pranil loves kajal");










	
	}

}
