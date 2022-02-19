package Selenium.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDynamicSpcejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipseOxygen\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("http://spicejet.com"); //URL in the browser
		WebElement ele = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div/div/div"));
		ele.sendKeys("BLR");
		//s.selectByIndex(2);
		//Thread.sleep(3000);
	}

}
