import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {


	@Test
	public void locator() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		
		WebElement topoperators = driver.findElement(By.cssSelector("a[href*='pau']"));
		boolean enabled = topoperators.isEnabled();
	System.out.println(enabled);
	String text = topoperators.getText();
	System.out.println(text);
       



		WebElement fnd1 = driver
				.findElement(By.xpath("//div[text()='CUSTOMERS']"));
		boolean string = fnd1.isEnabled();
		System.out.println(string);

		WebElement fnd2 = driver.findElement(By.xpath("//div[text()='OPERATORS']"));
		boolean string1 = fnd2.isEnabled();
		System.out.println(string1);

		WebElement fnd3 = driver.findElement(By.xpath("//div[text()='BUS TICKETS']"));
		boolean string2 = fnd3.isEnabled();
		System.out.println(string2);

	}

}
