package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {
	// action class
	// how do we right click particular webelement?
    //	using action class
	// for action class build method ,perform method is used

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        // to maximixe
        driver.manage().window().maximize();
        
   // span [text()='right click me']
     WebElement right  = driver.findElement(By.xpath("// span [text()='right click me']"));
        // for click the right button we use ACTION CLASS 
     Actions a = new Actions(driver);
     // there is method for context click  on action class to perform right click 
     a.contextClick(right).build().perform();
      //u l[contains(@class ,' context-menu-list context-menu-root')]
  List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class ,' context-menu-list context-menu-root')]/li"));
  for (WebElement e:options)
  {
	 // System.out.println(e.getText());
	  System.out.println(e);
	 }
	  
  }
 // driver.switchTo().alert().accept()
;
  
  }
	


