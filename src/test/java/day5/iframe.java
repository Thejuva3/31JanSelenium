package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        // to maximixe
        driver.manage().window().maximize();
        // input[contains(@type,'text')]
        // wryr frame than only we entrt text
        driver.switchTo().frame("iamframe");
        
        WebElement text = driver.findElement(By.xpath("// input[contains(@type,'text')]"));
        text.sendKeys("****");
        driver.switchTo().parentFrame()
;        

	}

}
