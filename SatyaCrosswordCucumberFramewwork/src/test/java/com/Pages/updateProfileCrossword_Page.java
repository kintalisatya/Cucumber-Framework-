package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.ExcelUtility.CrosswordExcel;

public class updateProfileCrossword_Page 
{

	WebDriver driver;
	By myAccount = By.linkText("My Account");
	By updateProfile = By.linkText("Update Profile");
	By mobile =By.id("customer_mobile");
	By landLine = By.id("customer_landline");
	By updateButton =By.id("customer_submit");

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
	
	//To Update Profile
	public void updatePro() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(myAccount).click();
		Thread.sleep(1000);
		driver.findElement(updateProfile).click();
		driver.findElement(mobile).sendKeys("9445600813");
		driver.findElement(landLine).sendKeys("01432655333");
		driver.findElement(updateButton).click();
	}
	
	public void closeTab() throws InterruptedException
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.close(); //To closes the current open window
	}
}
