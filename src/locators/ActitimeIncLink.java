package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeIncLink {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		//driver.findElement(By.linkText("actiTIME Inc.")).click();//using linkText() locator here
		driver.findElement(By.partialLinkText("TIME Inc.")).click();//using partialLinkText() locator here
		//driver.close();
		//driver.quit();

	}

}
