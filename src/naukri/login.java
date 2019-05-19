
package naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	public static void main(String args[])
	{
	//System.setProperty("webdriver.chrome.driver", "E:\\soft\\Selenium\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.firefox.marionette","E:\\soft\\Selenium\\drivers\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	d.get("https://www.naukri.com/");
//	driver.findElement(By.cssSelector("a[title='Jobseeker Login']")).click();
//	driver.findElement(By.name("email")).sendKeys("vikashkumar2091");
//	driver.findElement(By.id("pLogin")).sendKeys("spiderman");
	}
}
