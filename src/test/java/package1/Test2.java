package package1;
import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	//@Test(dataProviderClass = ProvideData.class , dataProvider  = "dataprovider2")
	@Test
	public void m3() throws InterruptedException
	{
		Date d =  new Date();
		System.out.println("Test 2 class m3 method "+d);
		Thread.sleep(1000);
	}
	
	@Test
	public void m4() throws InterruptedException
	{
		Date d =  new Date();
		System.out.println("Test 2 class m4 method "+d);
		Thread.sleep(1000);
		System.out.println("Anu");
		
	}

}
