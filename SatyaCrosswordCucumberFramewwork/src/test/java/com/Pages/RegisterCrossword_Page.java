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

public class RegisterCrossword_Page 
{

	WebDriver driver;
	By login = By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
	By email = By.id("user_session_email");
	By passwrd = By.id("user_session_password");
	By loginButton = By.xpath("//*[@id=\"user_session_submit\"]");
	By logout = By.linkText("Logout");
	

	public RegisterCrossword_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//To Launch the chrome browser using the Url
	public void LaunchBrowser() 
	{ 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	}
	
	//To take the screenshot
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts =((TakesScreenshot)driver); 
		File SrcFile = ts.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(SrcFile, new File(path)); 
	}

	//To register the required details
	public void register() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(1000);
		driver.findElement(By.id("customer_user_attributes_name")).sendKeys("sat");
		driver.findElement(By.id("customer_user_attributes_email")).sendKeys("satu@gmail.com");
		driver.findElement(By.id("customer_user_attributes_password")).sendKeys("bro09");
		driver.findElement(By.id("customer_user_attributes_password_confirmation")).sendKeys("bro09");
		driver.findElement(By.id("customer_user_attributes_additional_detail_dob")).sendKeys("30/02/2020");
		Thread.sleep(1000);
		driver.findElement(By.id("customer_gender_female")).click();	
		driver.findElement(By.id("customer_submit")).click();
	}
	
	public void loginDetails(String username, String password) throws IOException, InterruptedException 
	{
		driver.findElement(email).sendKeys(username);
		driver.findElement(passwrd).sendKeys(password);
		Thread.sleep(1000); 
		driver.findElement(loginButton).click();
	}
	
	public void Closepage() throws InterruptedException 
	{
		Thread.sleep(1000); 
		driver.close(); //To closes the current open window
	}
}
