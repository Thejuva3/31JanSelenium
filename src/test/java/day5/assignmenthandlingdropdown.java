package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmenthandlingdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        // to maximixe
        driver.manage().window().maximize();
     // tagname [attributename='attributevalue']
        //( select[id='animals'])
      // (select[ class="col-lg-3"])
        WebElement data =driver.findElement(By.cssSelector("select[ class='col-lg-3']"));
        
        
	}

}
