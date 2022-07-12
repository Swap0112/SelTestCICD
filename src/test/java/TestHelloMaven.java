
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
		
		//driver.manage().window().maximize();	
		
		//driver.manage().window().maximise();
		
		driver.close();
	    
	   						
	}
}
	
  	
	
