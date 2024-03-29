package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        // to maximixe
        driver.manage().window().maximize();
        driver.manage().window().minimize();
       // driver.quit();
        
        

        
	}

}
