package com.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		
		driver.findElement(By.name("cusid")).sendKeys("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();
		System.out.println("First Alert Window....."+a1.getText());
//		a1.dismiss();
		a1.accept();
		Thread.sleep(2000);
		
		Alert a2 = driver.switchTo().alert();
		System.out.println("Second Alert Window...."+a2.getText());
//		a2.dismiss();
		a2.accept();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
