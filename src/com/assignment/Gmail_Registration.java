package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail_Registration {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("abc");
		Thread.sleep(3000);
		
		driver.findElement(By.id("lastName")).sendKeys("bcd");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("day")).sendKeys("22");
		Thread.sleep(3000);
		
		Select listvalue = new Select(driver.findElement(By.id("month")));
		listvalue.selectByVisibleText("July");
		Thread.sleep(3000);
		
		driver.findElement(By.id("year")).sendKeys("2023");
		Thread.sleep(3000);
		
		Select selectGender = new Select(driver.findElement(By.id("gender")));
		selectGender.selectByVisibleText("Custom");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
	}

}
