package day6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basemethods {
	 public static WebDriver driver;
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
     
		driver = new ChromeDriver();
	}
    public static void puturl() {

    	driver.get("https://www.saucedemo.com/");
        
        driver.manage().window().maximize();
}
	public static void validenterusernameandpassword() {
		
	        
	// id=user-name
	        WebElement usernname= driver.findElement(By.id("user-name"));
	        // name="password"
	        WebElement password = driver.findElement(By.name("password"));
	        // "password"
	        WebElement login = driver.findElement(By.id("login-button"));
	        usernname.sendKeys("standard_user");
	        password.sendKeys("secret_sauce");
	        login.click();
	     
	}
	public static void screenshot(String name) throws IOException
	{
		TakesScreenshot	ts = (TakesScreenshot)driver ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//C:\Users\itsme\eclipse-workspace\31JanSelenium\target
		File destination = new File("C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\target"+name+".png");
	
		FileHandler.copy(source, destination);
	}
	public static void validationcheck() {
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement twiter= driver.findElement(By.linkText("Twitter"));
		 twiter.click();
		  ww.until(ExpectedConditions.visibilityOf(twiter));
		  System.out.println("test case is passed");
	}
	public static void teardown() {
		driver.quit();
	}
	
}
