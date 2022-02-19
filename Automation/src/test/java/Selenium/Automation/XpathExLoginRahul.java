package Selenium.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class XpathExLoginRahul {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipseOxygen\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys("Hello");
//		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
//		driver.findElement(By.className("signInBtn")).click();
//		//Thread.sleep(3000);
//		String t = driver.findElement(By.cssSelector("p.error")).getText();
//		System.out.println(t);
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("NameLogin");
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@abc.com");
//		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123454321");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
//		System.out.println(driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText());
//		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
//		
//		driver.findElement(By.id("inputUsername")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2);
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		//driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@id='root']/div/div/div/p")).getText());
		Thread.sleep(2000);
		String actText = driver.findElement(By.tagName("p")).getText();
		System.out.println(actText);
		Assert.assertEquals(actText, "You are successfully logged in.");
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.quit();
		
		
		
		
	}

}
