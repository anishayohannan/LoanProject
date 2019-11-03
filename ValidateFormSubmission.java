package NewProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

public class ValidateFormSubmission extends HomePage{
	@Test
	public void validation()
	{
		//ValidateFormSubmission vf=new ValidateFormSubmission();
		//vf.basePageNavigation();
	
	AssertJUnit.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/strong")).getText(),"Lead saved successfully! Congratulations on the new lead!");
	System.out.println("Successfully validated the current entry");
	
	}

}
