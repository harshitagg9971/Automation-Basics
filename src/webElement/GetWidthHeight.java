package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWidthHeight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement image=driver.findElement(By.xpath("(//img[@class='img'])[1]"));
		System.out.println("Width -"+image.getSize().getWidth());
		System.out.println("Height -"+image.getSize().getHeight());
	}

}
