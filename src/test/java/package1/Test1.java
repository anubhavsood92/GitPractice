package package1;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{

		
	@Test(invocationCount = 5, threadPoolSize =  5)
	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("m1 method");
		System.out.println("m2 method");
		System.out.println("m5 ");
		System.out.println("m4 method");
		System.out.println("m3 method");
		driver.quit();
		
	}
	
		

}
