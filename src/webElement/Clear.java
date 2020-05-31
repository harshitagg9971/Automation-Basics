package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Clear {
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.gecko.driver","G:/selenium files/geckodriver-v0.26.0-win64/geckodriver.exe"); 
		  WebDriver driver = new FirefoxDriver();
		/*
		 * System.setProperty(
		 * "webdriver.ie.driver","G:/selenium files/IEDriverServer_x64_2.52.0/IEDriverServer.exe"
		 * ); WebDriver driver = new InternetExplorerDriver();
		 */	/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Harshit Aggarwal");
		Firstname.clear();
	}

}
