package com.commonaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonAction {
      public static WebDriver driver; 
	
 public static void launch() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/telecom/index.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
 }
 public void click(WebElement e) {
	 e.click();
	 
 }
 public void fill(WebElement e,String s) {
	 e.sendKeys(s);
 }

}
