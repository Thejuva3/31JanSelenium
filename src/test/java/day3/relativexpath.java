package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {
	// it will directly going to particular web element
	// using formula //it have 2 types
	//using contain 
	   // ,//TAGNAME [contains(@ATTRIBUTE NAME,'ATTRIBUTE VALUE']
	// using text 
        // TAGNAME[text()=""]
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        // to maximixe
        driver.manage().window().maximize();
// id=user-name
        
        // input[contains(@data-test,'username')] data-test="username"
   WebElement username    = driver.findElement(By.xpath("//input[contains(@data-test, 'username')]"));
   // input [contains(@placeholder,'password')]placeholder="Password"
   WebElement password = driver.findElement(By.xpath("//input [contains(@placeholder, 'Password')]"));
   // input [contains(@name,'login-button')] name="login-button"
   WebElement login = driver.findElement(By.xpath("//input [contains(@name, 'login-button')]"));
     username.sendKeys("standard_user");
     password.sendKeys("secret_sauce");
     login.click();
     // Twitter // using text format
      // a[text()='Twitter']
   WebElement twi  =driver.findElement(By.xpath("// a[text()='Twitter']"));
     twi.click();
     
        
	}

}
