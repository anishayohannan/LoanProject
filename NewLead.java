package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewLead {
	public WebDriver driver;
	By newlead=By.xpath("/html/body/div/div/div/div/div/div[1]/div[2]/div/a");
	
	


	public NewLead(WebDriver driver) {
		this.driver=driver;
	}




	public WebElement getnewLead()
	{
	return(driver.findElement(newlead));

}
}
