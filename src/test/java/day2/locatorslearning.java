package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorslearning {
	//locators is used to locate the WEBELEMENT
	// id ,name ,link text,partial link text,css selector,xpath,clas
	// xpath is majarioty used

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        // to maximixe
        driver.manage().window().maximize();
// id=user-name
        WebElement usernname= driver.findElement(By.id("user-name"));
        // name="password"
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
