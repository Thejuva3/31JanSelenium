package day4;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionspart2 {
// drag and drop
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        // to maximixe
        driver.manage().window().maximize();
        // id="capitals" div // id="dropContent"
        // div [contains(@id,'dropContent')]
        Actions a = new Actions(driver) ;
  List<WebElement>   capitals=   driver.findElements(By.xpath("// div[contains(@id,'dropContent')]/div"));
  List<WebElement>   countries =   driver.findElements(By.xpath("// div[contains(@id,'countries')]/div"));
  String capital ="Washington";
  String countri= "United States";
  for (WebElement e :capitals) {
	  if (e.getText().equals(capital)) {
		  for(WebElement ee : countries) {
			  if (ee.getText().equals(countri)) {
				  // drag and drop method
				  a.dragAndDrop(e, ee).build().perform();
				  break;
			  }
			  
		  }
	  }
  }
  
	}

}
