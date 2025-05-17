package com.selenium;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Testgam {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkplace\\SeleniumHandsOn\\Resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
	
options.addArguments("--disable-blink-features=AutomationControlled");

WebDriver driver=new ChromeDriver(options);	


		driver.get("https://mail.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("kajalkambli85@gmail.com");
		
		Thread.sleep(200);
	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(25000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.quit();
		
		System.out.println("kajal");
		

	}

}
