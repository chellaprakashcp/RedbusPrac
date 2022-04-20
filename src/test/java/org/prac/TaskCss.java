package org.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskCss {
	

	@Test
	public void topOperators() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		List<WebElement> tpoprt = driver.findElements(By.cssSelector("a[href*='Kanker']"));
		if ( tpoprt.size() == 1) {
			System.out.println("The Element is present ");
		} else {
			System.out.println("The Element is not present");

		}

	
		WebElement cstmr = driver
				.findElement(By.cssSelector("div[class='fl']:nth-of-type(1)>div:nth-child(1)>div:nth-child(1)"));

		boolean customersdisplayed = cstmr.isDisplayed();
		System.out.println(customersdisplayed);
		String cstmrtxt = cstmr.getText();
		System.out.println( cstmrtxt);

		WebElement optrs = driver
				.findElement(By.cssSelector("div[class='fl']:nth-of-type(2)>div:nth-child(1)>div:nth-child(1)"));
		boolean operatorsdisplayed = optrs.isDisplayed();
		System.out.println(operatorsdisplayed);

		WebElement btickets = driver
				.findElement(By.cssSelector("div[class='fl']:nth-of-type(3)>div:nth-child(1)>div:nth-child(1)"));
		boolean enabled = btickets.isEnabled();
		System.out.println(enabled);
	}

}
