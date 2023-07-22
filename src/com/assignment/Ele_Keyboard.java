package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		Action a1 = actions.moveToElement(element)
				.keyDown(element, Keys.LEFT_SHIFT)
				.sendKeys("vishal")
				.keyUp(element, Keys.LEFT_SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		a1.perform();
		
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
