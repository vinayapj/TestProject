package Selenium.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipseOxygen\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("http://spicejet.com"); //URL in the browser
		WebElement ele = driver.findElement(By.xpath("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(3000);
		String txt = s.getFirstSelectedOption().getText();
		System.out.println(txt);
		s.selectByIndex(3);
		Thread.sleep(3000);
		String txt1 = s.getFirstSelectedOption().getText();
		System.out.println(txt1);

		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	}

}
