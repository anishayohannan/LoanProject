package NewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public WebDriver InitializeBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/anishayohannan/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
return driver;

}
}