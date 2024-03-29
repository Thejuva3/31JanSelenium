package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// tagname [attributename='attributevalue']
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        // to maximixe
        driver.manage().window().maximize();
       
        
     // input[data-test='username'
        WebElement username = driver.findElement(By.cssSelector("input[data-test='username']"));
        //input[name='login-button']
        //input[data-test='password']
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        WebElement login = driver.findElement(By.cssSelector("input[name='login-button']"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
	}

}
