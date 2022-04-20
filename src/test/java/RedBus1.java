import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RedBus1{
	WebDriver driver;
	
	List<String> monthList = Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sept","Oct","Nov","Dec");
	String expDate = null;
	int expMonth;
	int expYear;
	
	String calDate = null;
	int calMonth;
	int calYear;
	
	boolean dateNotFound;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void loadRedBus(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		
	
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
	}
	
	@Test(priority=1)
	public void searchBus(){
		WebElement srcElement = driver.findElement(By.id("src"));
		srcElement.clear();
		srcElement.sendKeys("Pune");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		
		
		WebElement dstElement = driver.findElement(By.id("dest"));
		dstElement.clear();
		dstElement.sendKeys("Bangalore");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
	}
	
	@Test(priority=2)
	public void selectDateCal(){
		WebElement calendar = driver.findElement(By.xpath(".//input[@id='onward_cal']"));
		calendar.click();
		
		expDate = "20";
		expMonth = 5;
		expYear=2017;
		dateNotFound = true;
		
		
		
		while(dateNotFound){
			WebElement monthYearEle = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']//table//td[@class='monthTitle']"));
			String monthYear= monthYearEle.getAttribute("innerHTML");
			
			String[] s = monthYear.split(" ");
			String calMonth = s[0];
			int calYear = Integer.parseInt(s[1]);
			
			
			if(monthList.indexOf(calMonth)+1 ==expMonth && expYear==calYear){
				selectDate(expDate);
				dateNotFound = false;
			}
			
			//If current selected month and year are less than expected month and year then go Inside this condition
			else if(monthList.indexOf(calMonth)+1 <expMonth && expYear==calYear||expYear>calYear){
				//Click on next button of date picker.
				calendar.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']//button[.='>']")).click();
			}
			//If current selected month and year are greater than expected month and year then go Inside this condition.
			else if(monthList.indexOf(calMonth)+1 >expMonth && expYear==calYear||expYear<calYear){
				calendar.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']//button[.='<']")).click();
			}
		}
		
		driver.findElement(By.xpath(".//*[@id='search_btn']")).click();
		
	}

	private void selectDate(String expDate2) {
		// TODO Auto-generated method stub
		driver.close();
	}

}
