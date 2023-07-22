package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);
		
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<=3;i++) {
			driver.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(2000);
		}
		driver.close();
	}

}
