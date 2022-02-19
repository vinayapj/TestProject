package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\vinay\\Documents\\SeleniumDrivers\\msedgedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/input")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		driver.findElement(By.xpath("//div[@id='content']/ul/li[11]/a")).click();
		WebElement drp=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select s=new Select(drp);
		s.selectByIndex(1);
		Thread.sleep(3000);
		System.out.println(s.getFirstSelectedOption());
		//driver.close();
		driver.navigate().back();
		
	}

}
