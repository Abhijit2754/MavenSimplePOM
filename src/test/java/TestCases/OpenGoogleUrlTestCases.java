package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import ObjectClasses.GooglePage;
import dataProvider.DataProviderForForm;

public class OpenGoogleUrlTestCases extends BaseClass{
		
	@BeforeMethod
	public void init()
	{	
		inititlization();
	}
	
	@Test(dataProvider = "searchKeywordpassing", dataProviderClass = DataProviderForForm.class)
	public void checkKeywordAddOrNot(String keyword)
	{
		GooglePage gp = new GooglePage(driver);
		
		System.out.println(keyword);
		
		gp.insertValue(keyword);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}