package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testplg {

	WebDriver driver;
	File file;
	FileInputStream fip;
	Properties prop;
	
	public void initialconf() throws IOException {
		
		file = new File(System.getProperty("user.dir"+"//src//config//cnfg.properties"));
		 fip = new FileInputStream(file);
		 prop=new Properties();
		prop.load(fip);
		
		 public String ReadProperty(String Key) {
			
			return;
			
		}
	}
	
	
	
	
	@BeforeMethod
	public void setup() {
	
	
	
	
	
	}
	
	
	
	
	
	
	
	@Test
	public void Testplg() {




	}




	@AfterMethod	
	public void quit() {





	}







}
