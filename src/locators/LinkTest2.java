package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));//using linkText() locator here
		System.out.println(link.getText());
		link.click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();//using partialLinkText() locator here

	}

}
