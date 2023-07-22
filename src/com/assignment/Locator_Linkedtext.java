package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Linkedtext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/login.php/"); 
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
