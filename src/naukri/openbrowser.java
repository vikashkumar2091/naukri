package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class openbrowser
{
	static WebDriver driver ;
	public static void login() throws InterruptedException
	{
//	System.setProperty("webdriver.chrome.driver", "E:\\soft\\Selenium\\drivers\\chromedriver.exe");
//  WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.gecko.driver","E:\\soft\\Selenium\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	try
	{
		driver.get("https://www.naukri.com/nlogin/login");
	Thread.sleep(3000);
//	driver.findElement(By.id("login_Layer")).click();
	driver.findElement(By.id("usernameField")).sendKeys("vikashkumar2091@hotmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("spiderm@n1");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	System.out.println("login success");
	Thread.sleep(3000);
	}
	
	catch (InterruptedException i)
	{
		System.out.println("failed");
		driver.close();
	}
	}
	
	public static void update_profile() throws InterruptedException
	{  
		WebDriverWait wait = new WebDriverWait (driver, 20);
		
			
		try
		{
		WebElement a= driver.findElement(By.cssSelector("a[href='https://my.naukri.com/HomePage/view']"));
		Actions act1= new Actions(driver);
		act1.moveToElement(a).perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[title='Edit Profile']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".resumeHeadline>div>div>div>span:first-child")));
		driver.findElement(By.cssSelector(".resumeHeadline .edit.icon")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".action.s12 [type='submit']")).click();
		System.out.println("submit success");
		Thread.sleep(3000);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".resumeHeadline>div>div>div>span:first-child")));
		WebElement b= driver.findElement(By.cssSelector("a[href='https://my.naukri.com/HomePage/view']"));
		Actions act2= new Actions(driver);
		act2.moveToElement(b).perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[title='Logout']")).click();
		System.out.println("logout success");
		}
		
		catch (InterruptedException i)
		{
			System.out.println("failed");
		}
		
		finally
		{
			driver.close();
		}
	}
public static void main(String args[]) throws InterruptedException
{
	login();
	update_profile();
}
}