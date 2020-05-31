package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public  static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com");
	//driver.findElement(By.linkText("Discover")).click(); //using linkText() locator here
	driver.findElement(By.partialLinkText("Disco")).click(); //using partialLinkText() locator here
	}
	
}	
