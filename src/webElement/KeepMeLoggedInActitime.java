package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeepMeLoggedInActitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement loginCheckbox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox'][@type='checkbox']"));
		//using multiple attributes in a single xpath expression
		loginCheckbox.click(); 
		/*
		 * System.out.println(loginCheckbox.isDisplayed());
		 * System.out.println(loginCheckbox.isEnabled());
		 * System.out.println(loginCheckbox.isSelected());
		 */
		 
	}

}
