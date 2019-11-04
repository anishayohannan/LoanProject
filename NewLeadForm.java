package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewLeadForm extends Customer {
	public WebDriver driver;
	By customerName=By.id("customerName");
	By address1=By.id("address1");
	By address2=By.id("address2");
	By city=By.id("city");
	By state=By.id("state");
	By pincode=By.id("pinCode");
	By email=By.id("email");
	By phoneNo=By.id("phone");
	By lead=By.id("leadGivenBy");
	By product=By.id("productType");
	By leadsource=By.id("leadsource");
	By emplo=By.id("employment_type");
	By submit=By.xpath("//button[@type='submit']");

	
	public NewLeadForm(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getcustomername()
	{
		return driver.findElement(customerName);
	}
	public WebElement getaddress1()
	{
		return driver.findElement(address1);
	}
	public WebElement getaddress2()
	{
		return driver.findElement(address2);
	}
	public WebElement getcity()
	{
		return driver.findElement(city);
	}
	public void getstate()
	{
		Select s= new Select(driver.findElement(state));
		 s.selectByVisibleText("Kerala");
	}
	public WebElement getpincode()
	{
		return driver.findElement(pincode);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getphoneNo()
	{
		return driver.findElement(phoneNo);
	}
	public WebElement getlead()
	{
		return driver.findElement(lead);
	}
	public void getproduct()
	{
		Select t=new Select(driver.findElement(product));
	    t.selectByVisibleText("Home Loan");
	}
	public void getleadsource()
	{
		Select b=new Select(driver.findElement(leadsource));
		b.selectByVisibleText("Reference");
	}
	public void getemployment()
	{
		Select h=new Select(driver.findElement(emplo));
		h.selectByVisibleText("Other");
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
	
	

}

