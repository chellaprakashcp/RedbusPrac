package org.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusPract {
	@Test
	
	private void prax() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");
WebElement from = driver.findElement(By.className("db"));
	
	from.sendKeys("chennai");
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("Thanjavur");
	
	Select sel = new Select(null);
	WebElement dtt = driver.findElement(By.className("fl button"));
	dtt.click();
	WebElement date = driver.findElement(By.className("db text-trans-uc"));
	date.click();
	WebElement currentdate = driver.findElement(By.className("current day"));
	currentdate.click();
	
	}
	
	

}
