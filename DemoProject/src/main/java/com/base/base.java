package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;
	
	
	public static void Intializer() {
		
		
		
		System.setProperty("webdriver.gecko.driver","C:\\SGShilpa\\Java Examples\\Java Folder\\Selenium\\Installer\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
	
	}
}
