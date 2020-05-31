package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsEnabledIsSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        WebElement maleCheckbox = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        maleCheckbox.click();
        System.out.println(maleCheckbox.isDisplayed());
        System.out.println(maleCheckbox.isEnabled());
        System.out.println(maleCheckbox.isSelected());
        System.out.println("*********************************");
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();;
        System.out.println(maleCheckbox.isDisplayed());
        System.out.println(maleCheckbox.isEnabled());
        System.out.println(maleCheckbox.isSelected());
	}

}
