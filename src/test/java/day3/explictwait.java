package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictwait {
     // d/b implict nd explict wait
	// if the webelment is loaded in 5 sec but we gave 10 sec to wait 
	// rest of the 5 sec will be skipped.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        // to maximixe
        driver.manage().window().maximize();
        // for explict we call webdrive
        WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
        
// id=user-name
        WebElement usernname= driver.findElement(By.id("user-name"));
        // untill method
      System.out.println( ww.until(ExpectedConditions.visibilityOf(usernname)));
       
        WebElement password = driver.findElement(By.name("password"));
        // "password"
        WebElement login = driver.findElement(By.id("login-button"));
        usernname.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        WebElement twiter= driver.findElement(By.linkText("Twitter"));
        WebElement Linkedin= driver.findElement(By.partialLinkText("Link"));
        twiter.click();
        Linkedin.click();

	}

}
