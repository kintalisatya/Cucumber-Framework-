package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ExcelUtility.CrosswordExcel;

public class WindowCrossword_Page
{

	WebDriver driver;
	By stationery = By.xpath("//*[@id=\"nav-menu-915599\"]/ul/li[3]/a");
	
	public void Launch() throws IOException 
	{ 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //To maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //Wait for mentioned time
	}
	
	//To take the screenshot
	public void screenshots(String path) throws IOException
	{
		TakesScreenshot ts =((TakesScreenshot)driver); 
		File SrcFile = ts.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(SrcFile, new File(path)); 
	}
	
	//Using webdriver get visting the testing Website and login
	public void WebPage() throws IOException 
	{
		driver.get("https://www.crossword.in/"); 
		System.out.println(driver.getTitle()); 
		
		CrosswordExcel data = new CrosswordExcel();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_session_email")).sendKeys(data.excel_username(1)); 
		driver.findElement(By.id("user_session_password")).sendKeys(data.excel_password(1));
		driver.findElement(By.xpath("//*[@id=\"user_session_submit\"]")).click();
	}
	
	//Window handling
	public void windowHandle() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(stationery).click();	
		Set<String> winHandles = driver.getWindowHandles();
		System.out.println("The number of windows handles are" +winHandles.size());
		for(String winHandle:winHandles)
		{
			driver.switchTo().window(winHandle);
		}
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		Set<String> winHandles2 = driver.getWindowHandles();
		System.out.println("The number of windows handles are " +winHandles2.size());
		for(String winHandle2:winHandles2)
		{
			driver.switchTo().window(winHandle2);
			driver.close();
		}	
	}
	
	public void closeTab() throws InterruptedException
	{
//		driver.findElement(By.linkText("Logout")).click();
//		driver.close(); //To closes the current open window
	}
}
