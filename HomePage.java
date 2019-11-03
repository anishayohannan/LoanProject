package NewProject;

import org.testng.annotations.Test;
import Resources.Customer;
import Resources.LoginPage;
import Resources.NewLead;
import Resources.NewLeadForm;

public class HomePage extends Base {
	public String variable;

	@Test
	public void basePageNavigation()
	{
		driver=InitializeBrowser();
		driver.get("http://test.dsaassist.com/login");
		LoginPage Lp=new LoginPage(driver);
		Lp.getEmail().sendKeys("anishamy10@gmail.com");
		Lp.getpass().sendKeys("Anaya#2019");
		Lp.getLogin().click();
		NewLead nl=new NewLead(driver);
		nl.getnewLead().click();
		NewLeadForm nf= new NewLeadForm(driver);
		Customer customer=new Customer();
		this.variable=customer.output();
		nf.getcustomername().sendKeys("AnishaMY"+variable);
		nf.getaddress1().sendKeys("Vakkayil House");
		nf.getaddress2().sendKeys("Kizhavalloor");
		nf.getcity().sendKeys(customer.City);
		nf.getstate();
		nf.getpincode().sendKeys("689703");
		nf.getemail().sendKeys("ani@gmail.com");
		nf.getphoneNo().sendKeys(customer.phoneNo);
		nf.getlead().sendKeys("john");
		nf.getproduct();
		nf.getleadsource();
		nf.getemployment();
		nf.submit().submit();
		
		
		
	}

}
