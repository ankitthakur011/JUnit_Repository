package JUnitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JavaTest {
	
	WebDriver driver;
	
	@Rule
	public ErrorCollector errcollector = new ErrorCollector();
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		System.getProperties();
	}

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com/");
		//driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		//assertEquals("Game of Thrones",el);
		//System.out.println("WebElemnt is" +el);
	}

	@After
	public void tearDown() throws Exception {
		try{
				driver.quit();
		}
		catch (Throwable t)
		{
		System.out.println("Error collected");
		errcollector.addError(t);
	
		}
	}
	
}
