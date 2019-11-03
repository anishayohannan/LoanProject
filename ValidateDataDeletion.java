package NewProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.DataDeletion;

public class ValidateDataDeletion extends HomePage {
	
	@Test
	public void datadeletion()
	{
		//ValidateDataDeletion vd=new ValidateDataDeletion();
		//vd.basePageNavigation();
		//basePageNavigation();
		driver.findElement(By.xpath("//*[@id=\"order-listing_filter\"]/label/input")).sendKeys("AnishaMY"+variable);
		DataDeletion dl=new DataDeletion(driver);
		dl.selectAction().click();
		dl.delete().click();
		dl.popup().click();
		
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/strong")).getText(), "Record has been deleted!");
	}
	
	


}
