package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By emailid=By.id("email");
	By pass=By.id("password");
	By login=By.className("login100-form-btn");
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getEmail()
	{
	return(driver.findElement(emailid));	
	}
	
	public WebElement getpass()
	{
		return(driver.findElement(pass));
	}
	public WebElement getLogin()
	{
	return(driver.findElement(login));	
	}
	

}
