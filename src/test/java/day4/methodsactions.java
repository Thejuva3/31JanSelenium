package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class methodsactions {
  public static WebDriver driver;
  // without create object we call is known as global
     public static  Actions a ;
     
  public static void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
      driver = new ChromeDriver();
      a= new Actions(driver);
      
  }
     public static void puturl() {
    	 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
         // to maximize
         driver.manage().window().maximize();
     }
     public static void draganddrop( String capital,String countri) {
    	 List<WebElement>   capitals=   driver.findElements(By.xpath("// div[contains(@id,'dropContent')]/div"));
    	  List<WebElement>   countries =   driver.findElements(By.xpath("// div[contains(@id,'countries')]/div"));
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
	public static void main(String[] args) throws InterruptedException  {
		methodsactions.setup();
		methodsactions.puturl();
		methodsactions.draganddrop("Madrid", "Spain");
		// put our to code to sleep or slow by our given time seconds is known as THREAD SLEEP
		Thread.sleep(2000);
		methodsactions.draganddrop("Copenhagen", "South Korea");
	}

}
