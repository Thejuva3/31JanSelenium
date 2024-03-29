package day4;


	import java.io.File;
	import java.io.IOException;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;

	public class ss {

	public static WebDriver driver ;
		
		public static Actions a ;
		
		// takescreenshot is a interface 
		
		public static TakesScreenshot ts ;
		
		public static void setup()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\src\\test\\resources\\chromedriver.exe"); 
			driver = new ChromeDriver();
			a = new Actions(driver);
			ts = (TakesScreenshot)driver ;
			//type casting maping same concepts in a single variable 
			
		}
		
		public static void puturl()
		{
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
			driver.manage().window().maximize();
		}

		public static void draganddrop(String capital, String countr)
		{
			List<WebElement> capitals = 	driver.findElements(By.xpath("//div[contains(@id, 'dropContent')]/div"));
			List<WebElement> countries = 	driver.findElements(By.xpath("//div[contains(@id, 'countries')]/div"));


			for(WebElement e:capitals )
			{
				if(e.getText().equals(capital))
				{
					for(WebElement e1 : countries)
					{
						if(e1.getText().equals(countr))
						{
							// drag and drop 
							
							a.dragAndDrop(e, e1).build().perform();
							break ;
						}
					}
				}
			}
			
			
		}
		
		public static void screenshot(String name) throws IOException
		{
			File source = ts.getScreenshotAs(OutputType.FILE);
			//C:\Users\itsme\eclipse-workspace\31JanSelenium\target
			File destination = new File("C:\\Users\\itsme\\eclipse-workspace\\31JanSelenium\\target"+name+".png");
		
			FileHandler.copy(source, destination);
		}
		
		

	public static void main(String[] args) throws InterruptedException, IOException {
		ss.setup();
       ss.puturl();
       ss.draganddrop("Madrid", "Spain");
        ss.screenshot("tc01");
       Thread.sleep(2000);
       
       ss.draganddrop("Copenhagen", "South Korea");
       ss.screenshot("tc02");
	}

}
