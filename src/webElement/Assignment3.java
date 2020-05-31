package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
			Firstname.sendKeys("Mayank");
			for(int i=0;i<2;i++) {
				Firstname.sendKeys(Keys.ARROW_LEFT);
			}
			Firstname.sendKeys(Keys.BACK_SPACE);
			for(int i=0;i<2;i++) {
				Firstname.sendKeys(Keys.NUMPAD0);
			}
		}	
}
