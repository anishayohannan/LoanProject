package Resources;
import java.util.Random;

public class Customer {
	public String Name="AnishaMY";
	public String phoneNo="9786534789";
	public String City="konni";
	
	public String output()
	{
		Random rnd=new Random();
		int number=rnd.nextInt(999999);
		return String.format("%06d", number);
		
	}


	
}
