package Selenium.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipseOxygen\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			//driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Ahmedabad (AMD)");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Bengaluru (BLR)");
			//driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
			
	}

}
