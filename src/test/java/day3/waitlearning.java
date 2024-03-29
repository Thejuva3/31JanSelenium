package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitlearning {
	//implicit wait
	// explicit wait

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        // to maximixe
        driver.manage().window().maximize();
        // code for wainting implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
// id=user-name
        WebElement usernname= driver.findElement(By.id("user-name"));
        // name="password"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement password = driver.findElement(By.name("password"));
        // "password"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
