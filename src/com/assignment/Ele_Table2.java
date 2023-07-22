package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\vishal\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		String thValue=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]")).getText();
		System.out.println("thValue is.."+thValue);
		
		List<WebElement> thList=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Th size is.."+thList.size());
		
		for(int i=1;i<=thList.size();i++) {
			String thValues=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
			System.out.println("Th values...."+thValues);
		}
		
		String trValue = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]/a")).getText();
		System.out.println("Tr is..."+trValue);
		
		List<WebElement> trList=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("TrList Size..."+trList.size());
		
		for(int i=1;i<=trList.size();i++) {
			String trvalue=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td")).getText();
			System.out.println("Tr value..........."+trvalue);
		}
		Thread.sleep(4000);
		driver.close();
	}

}
