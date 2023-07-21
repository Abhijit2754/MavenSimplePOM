package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public void inititlization()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
}