package ObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class GooglePage extends BaseClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//textarea[@id='APjFqb']")
	public WebElement searhcbox;	
	
	public GooglePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertValue(String kaywaord)
	{		
		searhcbox.sendKeys(kaywaord);
	}		
	
}
