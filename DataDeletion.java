package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataDeletion {
	
private WebDriver driver;

	
	
	public DataDeletion(WebDriver driver) {
		
		this.driver=driver;
	}

	By SelectAction=By.cssSelector("#order-listing > tbody > tr:nth-child(1) > td:nth-child(8) > div > button");
	public WebElement selectAction()
	{
	return(driver.findElement(SelectAction));	
	}
	By Delete=By.linkText("Delete");
	
	public WebElement delete()
	{
	return(driver.findElement(Delete));	
	}
	
	By Popup=By.xpath("/html/body/div[3]/div/div[4]/div[2]/button");
	
	public WebElement popup()
	{
	return(driver.findElement(Popup));	
	}
}
	
	
	
