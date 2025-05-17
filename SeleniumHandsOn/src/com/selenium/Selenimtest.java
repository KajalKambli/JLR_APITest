package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenimtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\EclipseWorkplace\\\\SeleniumHandsOn\\\\Resources\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("");
		
		
		driver.navigate().to("https://www.google.com");

	}

}
