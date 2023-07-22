package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:\\VVOV2\\Selenium_WebDriver\\src\\com\\html\\New.html");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("click Google")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Click Facebook")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
