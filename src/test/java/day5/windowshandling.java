package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
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
         WebElement faceb = driver.findElement(By.linkText("Facebook"));
        twiter.click();
        Linkedin.click();
        faceb.click();
        // close for particular part to be close
     //   driver.close();
        // quit for entire windows closed
     //   driver.quit();
        // to get particular page alone is GETWINDOWHANDLE
        String parenttab = driver.getWindowHandle();
        
        // to grt all the browser nd page get WINDOWHANDLES METHOD
        Set<String>list = driver.getWindowHandles();
        // we handling the page by index
        // but we dont have index concept 
        // so we crete list 
        List<String> allwindows = new ArrayList<String>(list)
;
        System.out.println(allwindows.size());
        // parent class lenght -1 we get the wimdow here we give 2 
        // 2-4 = 2 ,,, linkeden will b eopen 
        // parent tab , twitter,linkden,fb
        // (0)             (1)    (2)    (3) = index value
        
        driver.switchTo().window( allwindows.get(1));
        driver.close();
        Thread.sleep(4000);
        
        
        
        
        
	}

}
