package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdown {

	public static void main(String[] args) {
		// dropdown will be handle by class callled SElect class
		// which is coming from selenium package
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
        // select[data-test=product_sort_container]
        
        WebElement filter = driver.findElement(By.cssSelector("select[data-test=product_sort_container]"));
           //create object for select class
        Select s = new Select(filter);
        // to get all option in filter we use get method
      List<WebElement > options  = s.getOptions();
      for (WebElement e: options) {
    	  System.out.println(e.getText());
      }
      // selecting by index 
      // with visible text
      //with value
     s.selectByIndex(3);
     s.selectByVisibleText("Name (Z to A)");
     s.selectByValue("lohi");
     
      
        

        
	}

}
