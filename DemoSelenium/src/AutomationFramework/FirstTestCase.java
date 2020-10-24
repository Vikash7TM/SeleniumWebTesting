package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.linkedin.com/login";
		
		driver.get(url);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button [text()='Sign in']"));
		
		username.sendKeys("username@xyz");
		password.sendKeys("username123");
		login.click();
		
		String expectedURL = "https://www.linkedin.com/feed/";
		String actualOutcomeURL = driver.getCurrentUrl();
		
		if (actualOutcomeURL.equalsIgnoreCase(expectedURL) )
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
	}

}
