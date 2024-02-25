package basicSeleniumProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumProgram {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SoftwareTestingSetup\\geckodriver-v0.34.0-win32");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.close();
	}
}
