package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Element_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/newtours/register.php"); 
		Thread.sleep(3000);
		
		Select s1 = new Select(driver.findElement(By.name("country")));
		s1.selectByIndex(0);
		Thread.sleep(3000);
		s1.selectByValue("ANGOLA");
		Thread.sleep(2000);
		s1.selectByVisibleText("INDIA");
		Thread.sleep(1000);
		
		for(int i=0;i<50;i++) {
			s1.selectByIndex(i);
			Thread.sleep(1000);
		}
		driver.close();
	}

}
