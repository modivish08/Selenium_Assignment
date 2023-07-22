package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_mouse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.linkText("Home"));
		WebElement e2 = driver.findElement(By.linkText("Flights"));
		WebElement e3 = driver.findElement(By.linkText("Hotels"));
		
		Actions actions = new Actions(driver);
		Action action = actions.moveToElement(e1).build();
		action.perform();
		Thread.sleep(2000);
		
		Action action2 = actions.moveToElement(e2).build();
		action2.perform();
		Thread.sleep(2000);
		
		Action action3 = actions.moveToElement(e3).click().build();
		action3.perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
