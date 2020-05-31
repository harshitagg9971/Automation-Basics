package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSProperties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement firstName=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		System.out.println("Font size - "+firstName.getCssValue("font-size"));
		System.out.println("Font style - "+firstName.getCssValue("font-family"));
		System.out.println("Font color - "+firstName.getCssValue("color"));
	}

}
