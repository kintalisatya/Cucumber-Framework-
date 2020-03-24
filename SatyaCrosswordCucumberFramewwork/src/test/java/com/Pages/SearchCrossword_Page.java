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

public class SearchCrossword_Page
{
	WebDriver driver;
	By newSellers = By.xpath("//*[@id=\"content-slot\"]/div[4]/div/div/div/div[2]/div/a/img");
	By books =By.xpath("//*[@id=\"content-slot\"]/div[2]/div/div[4]/ul/div/div/li[2]/div/div[2]/span[1]/a");
	By wishlist = By.className("button");
	By mywishlist = By.linkText("My Wish List");
	By delete1 = By.linkText("Delete");
	
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
	public void webPage() throws IOException 
	{
		driver.get("https://www.crossword.in/"); 
		System.out.println(driver.getTitle()); 
		
		CrosswordExcel data = new CrosswordExcel(); 
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_session_email")).sendKeys(data.excel_username(1)); 
		driver.findElement(By.id("user_session_password")).sendKeys(data.excel_password(1));
		driver.findElement(By.xpath("//*[@id=\"user_session_submit\"]")).click();
	}
	
	//Searching for the books to add and delete wishlist
	public void search() throws InterruptedException 
	{
		driver.findElement(newSellers).click(); //Adding the book in the wishlist
		driver.findElement(books).click();
		Thread.sleep(2000);
		driver.findElement(wishlist).click();
		Thread.sleep(2000);
		driver.findElement(mywishlist).click(); //Deleting the book in the wishlist
		driver.findElement(delete1).click();
	}
	
	public void closeTab()
	{
		driver.findElement(By.linkText("Logout")).click(); 
		driver.close(); //To closes the current open window
	}

}
