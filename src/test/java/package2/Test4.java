package package2;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void m7() throws InterruptedException
	{
		Date d =  new Date();
		System.out.println("Test 4 class m7 method " + d);
		Thread.sleep(1000);
	}
	
	
	@Test
	public void m8() throws InterruptedException
	{
		Date d =  new Date();
		System.out.println("Test 4 class m8 method " + d);
		Thread.sleep(1000);
	}
	

}
