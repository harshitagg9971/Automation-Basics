package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		/*
		 * WebElement email = driver.findElement(By.id("email"));
		 * email.sendKeys("Harshit");
		 */
		driver.findElement(By.id("email")).sendKeys("Harshit Aggarwal");
		driver.close();
	}

}
