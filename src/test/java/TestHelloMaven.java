
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestHelloMaven {
	
	@Test
	public void testHelloMaven()
	
	{
	    System.out.println(" ..Hello World.. ");
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		//driver.manage().window().maximise();
		
		driver.close();
	    
	   						
	}
}
	
  	
	