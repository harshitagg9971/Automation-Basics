package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Kanika");
		Firstname.sendKeys(Keys.CONTROL,"a");
		Firstname.sendKeys(Keys.CONTROL,"c");
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys(Keys.CONTROL,"v");
	}

}
