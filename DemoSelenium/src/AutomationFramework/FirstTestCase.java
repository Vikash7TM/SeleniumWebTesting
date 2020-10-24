package AutomationFramework;

  
import org.openqa.selenium.WebDriver;  //contains Web driver class that is needed to instantiate the new browser
import org.openqa.selenium.chrome.*;   //contains the chromeDriver class needed to instantiate a chrome specific driver
import org.openqa.selenium.WebElement;   //Web Element refers to HTML Element 
import org.openqa.selenium.By;          // Webpage elements can by foud by their id. That is one of the ways to 
											//select an element on a webpage with selenium.

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setting the system property by key value pair 
		// here key is the particular browser driver
		// and value is the location of that driver on system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// Webdriver object is created
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.linkedin.com/login";
		
		//launching the browser session
		driver.get(url);
		//now setting the elements value by using ids 
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button [text()='Sign in']"));
		
		//sendkeys ---- type content automatically into an editable field while executing any tests
		username.sendKeys("username@xyz");
		password.sendKeys("username123");
		login.click(); // perform click action in browser
		
		//Setting up the expected and actual output values
		String expectedURL = "https://www.linkedin.com/feed/";
		String actualOutcomeURL = driver.getCurrentUrl(); //fetch the current url from browser
		
		if (actualOutcomeURL.equalsIgnoreCase(expectedURL) )  // comparing the result with expectedOutput
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close(); //closes the browser session
		System.out.println("Browsing session ended");
		
		System.exit(0);
		
	}

}
