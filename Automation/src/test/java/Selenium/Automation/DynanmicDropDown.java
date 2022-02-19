package Selenium.Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynanmicDropDown {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipseOxygen\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			//driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("in");
			List<WebElement> options = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
			
			for(WebElement option: options)
			{
				if (option.getText().equalsIgnoreCase("India"))
				
				{
					option.click();
				}
			}
			
			System.out.println(driver.findElements(By.xpath("//div[starts-with(@class,'fleft')]")).size());
			List<WebElement> chkboxes = driver.findElements(By.xpath("//div[starts-with(@class,'fleft')]"));
			for(WebElement chk:chkboxes) {
				if(chk.getText().equalsIgnoreCase("Student")) {
					Assert.assertTrue(chk.isSelected());
					//System.out.println(chk.isSelected());
					chk.click();
					Thread.sleep(2000);
					//System.out.println(chk.isSelected());
				}
				
			}
	}
		

}
